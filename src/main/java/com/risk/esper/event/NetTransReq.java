package com.risk.esper.event;

import java.io.Serializable;


/**
 * 网络支付-交易判定-请求
 * 
 * @author:zuoys
 * @date:2017年8月24日上午10:45:48
 * @version:V1.4.2
 */
public class NetTransReq  implements Serializable {
	private static final long serialVersionUID = 3776077622763203253L;

	private String userid;// 用户id 否 String(32) 传personid
	private String login;// 登录名 否 String（20） 手机号/邮箱
	private String accountlevel;// 账户等级 否 String(2) 0，1，2，3
	private String accounttype;// 账户类型 否 String（5） 1个人，2企业, 非必填时, 匹配全规则

	private String bankid;// 付款银行binid 否 String（30） 付款银行binid
	private String username;// 付款用户名 否 String(20) 王晓明

	private String idcard;// 付款身份证号 否 String（20） 34xxxxxxxxxxxxxx
	
	private String incardno_type;// 添加入账户类型 否 String（5）0不限  1个人，2企业, 非必填时, 匹配全规则

	private String inusername;// 收款用户名 否 String(20) 赵阳

	private String inidcard;// 收款身份证号 否 String（18） 34xxxxxxxxxxxxxx
	private String inbankid;// 收款银行binid 否 String（30） 收款银行binid （ebc）
	private String currency;// 币种 否 String（5） 支付支付订单币种（默认RMB）

	private String transtime;// 交易时间 是 String（20） 订单的创建时间yyyy-MM-dd HH:mm:ss

	private String id;
	
	
	private String logintype;//登录名类型01手机号;02邮箱;99:其它
	private String bankphone;//银行预留手机号

	//添加merchdomain(商户域名)、merchip(商户IP)、merchasynaddress(商户异步地址)
	private String merchdomain ;
	private String merchip ;
	private String merchasynaddress ;
	
	//添加注册手机号
	private String regisphone;
	
	//start 20190220添加字段，给美付宝事业部使用
	private String accountname;//付款账户名称
	private String inaccountname;//	收款账户名称
	private String inbankphone;//	收款银行预留手机号
	private String incardtype;//	收款卡类型
	private String inaccountlevel;//	收款人钱包账户等级
	private String merchorderid;//	商户订单号
	private String merchname;//	商户名称
	private String mac;//	MAC地址
	private String deviceid;//	设备ID
	private Integer terminaltype;//	终端类型
	private String loginip;//	登录IP
	private String lo;//	经度
	private String la;//	纬度
	private Integer terminaldevice;//	终端设备
	private String terminalmodel;//	终端型号
	private String terminalbrand;//	终端品牌
	private Long timestamp;//	时间戳
	private String imsi;//	IMSI
	private String gomeversion;//	美付宝版本号
	private String operateversion;//	终端操作系统版本
	//end 20190220添加字段，给美付宝事业部使用

	private String version;
	private String signature;
	private String key;
	
	protected String sysid;//012=钱包；003=微收单-线上；020=预付卡交易系统；006=微跨境
	protected String orderid ;// 订单号 是 String(32) 唯一值，每次交易都唯一
	protected Double amount ;// 金额 是 String(12) 转入卡金额如100.00 元
	protected String merchno ;// 商户号 是 String(15) 000000000000000钱包平台分配
	
	//互联网/预付卡
	protected String cardno ;// 付款卡号,预付卡号 否 String(25) 如果是银行卡，填写银行卡号；如果是余额支付，传余额ID（9001）
	
	
	//互联网有
	protected String mediumno ;// 付款钱包ID 否 String(20) 010开头
	protected String channeltype ;// 通道类型 是 String（2） 01快捷;02代收;03扫码;04网关;05公众号;06账户;07代付;08其他（电汇、现金等）;
	protected String transtype ;// 交易类型 是 String(2) 01消费 ;02充值 ;03转出;04提现 ;05代收;06代付;07退款;
	
	protected String takeTime; //耗时时间
	protected String status;
	
	
	//二级帐号相关的
	protected String inmediumno;// 收款钱包ID 否 String(20) 010开头的16位数字
	protected String incardno;// 收款卡号 否 String(25) 如果是银行卡，填写银行卡号；如果是余额支付，传余额ID（9001）
	
	
	protected String posid;// 终端号 是 =预付卡用
	
	protected String cardtype;//付款卡类型
	

	public NetTransReq() {
	}

	/**
	 * 必填字段 {"sysid", "orderid","merchno","amount"}
	 * 
	 * @return
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAccountlevel() {
		return accountlevel;
	}

	public void setAccountlevel(String accountlevel) {
		this.accountlevel = accountlevel;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getBankid() {
		return bankid;
	}

	public void setBankid(String bankid) {
		this.bankid = bankid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getInusername() {
		return inusername;
	}

	public void setInusername(String inusername) {
		this.inusername = inusername;
	}

	public String getInidcard() {
		return inidcard;
	}

	public void setInidcard(String inidcard) {
		this.inidcard = inidcard;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTranstime() {
		return transtime;
	}

	public void setTranstime(String transtime) {
		this.transtime = transtime;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInbankid() {
		return inbankid;
	}

	public void setInbankid(String inbankid) {
		this.inbankid = inbankid;
	}

	public String getIncardno_type() {
		return incardno_type;
	}

	public void setIncardno_type(String incardno_type) {
		this.incardno_type = incardno_type;
	}

	public String getBankphone() {
		return bankphone;
	}

	public void setBankphone(String bankphone) {
		this.bankphone = bankphone;
	}

	public String getLogintype() {
		return logintype;
	}

	public void setLogintype(String logintype) {
		this.logintype = logintype;
	}


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMerchdomain() {
		return merchdomain;
	}

	public void setMerchdomain(String merchdomain) {
		this.merchdomain = merchdomain;
	}

	public String getMerchip() {
		return merchip;
	}

	public void setMerchip(String merchip) {
		this.merchip = merchip;
	}

	public String getMerchasynaddress() {
		return merchasynaddress;
	}

	public void setMerchasynaddress(String merchasynaddress) {
		this.merchasynaddress = merchasynaddress;
	}

	public String getRegisphone() {
		return regisphone;
	}

	public void setRegisphone(String regisphone) {
		this.regisphone = regisphone;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public String getInaccountname() {
		return inaccountname;
	}

	public void setInaccountname(String inaccountname) {
		this.inaccountname = inaccountname;
	}

	public String getInbankphone() {
		return inbankphone;
	}

	public void setInbankphone(String inbankphone) {
		this.inbankphone = inbankphone;
	}

	public String getIncardtype() {
		return incardtype;
	}

	public void setIncardtype(String incardtype) {
		this.incardtype = incardtype;
	}

	public String getInaccountlevel() {
		return inaccountlevel;
	}

	public void setInaccountlevel(String inaccountlevel) {
		this.inaccountlevel = inaccountlevel;
	}

	public String getMerchorderid() {
		return merchorderid;
	}

	public void setMerchorderid(String merchorderid) {
		this.merchorderid = merchorderid;
	}

	public String getMerchname() {
		return merchname;
	}

	public void setMerchname(String merchname) {
		this.merchname = merchname;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public Integer getTerminaltype() {
		return terminaltype;
	}

	public void setTerminaltype(Integer terminaltype) {
		this.terminaltype = terminaltype;
	}

	public String getLoginip() {
		return loginip;
	}

	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}

	public String getLo() {
		return lo;
	}

	public void setLo(String lo) {
		this.lo = lo;
	}

	public String getLa() {
		return la;
	}

	public void setLa(String la) {
		this.la = la;
	}

	public Integer getTerminaldevice() {
		return terminaldevice;
	}

	public void setTerminaldevice(Integer terminaldevice) {
		this.terminaldevice = terminaldevice;
	}

	public String getTerminalmodel() {
		return terminalmodel;
	}

	public void setTerminalmodel(String terminalmodel) {
		this.terminalmodel = terminalmodel;
	}

	public String getTerminalbrand() {
		return terminalbrand;
	}

	public void setTerminalbrand(String terminalbrand) {
		this.terminalbrand = terminalbrand;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getGomeversion() {
		return gomeversion;
	}

	public void setGomeversion(String gomeversion) {
		this.gomeversion = gomeversion;
	}

	public String getOperateversion() {
		return operateversion;
	}

	public void setOperateversion(String operateversion) {
		this.operateversion = operateversion;
	}

	public String getSysid() {
		return sysid;
	}

	public void setSysid(String sysid) {
		this.sysid = sysid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getMerchno() {
		return merchno;
	}

	public void setMerchno(String merchno) {
		this.merchno = merchno;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getMediumno() {
		return mediumno;
	}

	public void setMediumno(String mediumno) {
		this.mediumno = mediumno;
	}

	public String getChanneltype() {
		return channeltype;
	}

	public void setChanneltype(String channeltype) {
		this.channeltype = channeltype;
	}

	public String getTranstype() {
		return transtype;
	}

	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}

	public String getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(String takeTime) {
		this.takeTime = takeTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInmediumno() {
		return inmediumno;
	}

	public void setInmediumno(String inmediumno) {
		this.inmediumno = inmediumno;
	}

	public String getIncardno() {
		return incardno;
	}

	public void setIncardno(String incardno) {
		this.incardno = incardno;
	}

	public String getPosid() {
		return posid;
	}

	public void setPosid(String posid) {
		this.posid = posid;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	@Override
	public String toString() {
		return "NetTransReq [userid=" + userid + ", login=" + login + ", accountlevel=" + accountlevel
				+ ", accounttype=" + accounttype + ", bankid=" + bankid + ", username=" + username + ", idcard="
				+ idcard + ", incardno_type=" + incardno_type + ", inusername=" + inusername + ", inidcard=" + inidcard
				+ ", inbankid=" + inbankid + ", currency=" + currency + ", transtime=" + transtime + ", id=" + id
				+ ", logintype=" + logintype + ", bankphone=" + bankphone + ", merchdomain=" + merchdomain
				+ ", merchip=" + merchip + ", merchasynaddress=" + merchasynaddress + ", regisphone=" + regisphone
				+ ", accountname=" + accountname + ", inaccountname=" + inaccountname + ", inbankphone=" + inbankphone
				+ ", incardtype=" + incardtype + ", inaccountlevel=" + inaccountlevel + ", merchorderid=" + merchorderid
				+ ", merchname=" + merchname + ", mac=" + mac + ", deviceid=" + deviceid + ", terminaltype="
				+ terminaltype + ", loginip=" + loginip + ", lo=" + lo + ", la=" + la + ", terminaldevice="
				+ terminaldevice + ", terminalmodel=" + terminalmodel + ", terminalbrand=" + terminalbrand
				+ ", timestamp=" + timestamp + ", imsi=" + imsi + ", gomeversion=" + gomeversion + ", operateversion="
				+ operateversion + ", version=" + version + ", signature=" + signature + ", key=" + key + ", sysid="
				+ sysid + ", orderid=" + orderid + ", amount=" + amount + ", merchno=" + merchno + ", cardno=" + cardno
				+ ", mediumno=" + mediumno + ", channeltype=" + channeltype + ", transtype=" + transtype + ", takeTime="
				+ takeTime + ", status=" + status + ", inmediumno=" + inmediumno + ", incardno=" + incardno + ", posid="
				+ posid + ", cardtype=" + cardtype + "]";
	}
	
	

}
