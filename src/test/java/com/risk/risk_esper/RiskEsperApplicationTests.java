package com.risk.risk_esper;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPStatement;
import com.risk.esper.event.LoginEvent;
import com.risk.esper.event.NetTransReq;
import com.risk.util.JsonUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RiskEsperApplicationTests {
	@Autowired
	private EPServiceProvider epService;
	@Autowired
    private EPAdministrator epAdministrator;
	

	@Test
	public void login() throws InterruptedException {
		EPStatement statement = epAdministrator.createEPL("select count(*) as num  from LoginEvent.win:time(10 sec) group by userCode having count(*)>5 ");
		statement.addListener( (newData, oldData) -> {
		  Long num = (Long) newData[0].get("num");
		  System.out.println(String.format("Num: %d", num));
		});
		for(int i=0;i<15;i++){
			LoginEvent login = new LoginEvent("15862663403","8836789032");
			System.out.println(login);
			epService.getEPRuntime().sendEvent(login);
			if(i>=10){
				TimeUnit.SECONDS.sleep(10);
			}else{
				TimeUnit.SECONDS.sleep(1);
			}
		}

	}
	
	
	@Test
	public void net() throws InterruptedException {
		//踩坑1  sum(amount)的时候  应用直接停止。原因amount是字符串导致的。改为Double之后就ok了。
		EPStatement statement = epAdministrator.createEPL("select sum(amount) as amount  from NetTransReq.win:time(1 sec) group by transtype,channeltype,mediumno having sum(amount)>15 ");
		statement.addListener( (newData, oldData) -> {
			System.out.println("---------------------");
			System.out.println(newData[0].getUnderlying().toString());
		  System.out.println(newData[0].get("amount"));
		});
		//for(int i=0;i<15;i++){
			String json = "{\"sysid\":\"012\",\"orderid\":\"20190126163224381\",\"amount\":\"20\",\"merchno\":\"SHID20181017253\",\"cardno\":null,\"mediumno\":\"0100981014042252\",\"channeltype\":\"01\",\"transtype\":\"01\",\"takeTime\":null,\"status\":null,\"inmediumno\":null,\"incardno\":null,\"posid\":null,\"cardtype\":null,\"userid\":null,\"login\":\"131****1112\",\"accountlevel\":null,\"accounttype\":\"1\",\"bankid\":null,\"username\":null,\"idcard\":null,\"incardno_type\":null,\"inusername\":null,\"inidcard\":null,\"inbankid\":null,\"currency\":null,\"transtime\":\"2019-01-26 16:32:24\",\"id\":null,\"logintype\":\"01\",\"bankphone\":null,\"merchdomain\":null,\"merchip\":null,\"merchasynaddress\":null,\"version\":null,\"signature\":null,\"key\":null}";
			NetTransReq net = (NetTransReq) JsonUtil.json_2_bean(json,NetTransReq.class);
			System.out.println(JsonUtil.to_json(net));
			System.out.println(net);
			epService.getEPRuntime().sendEvent(net);
		//}

	}

}

