package com.risk.esper.event;


public class LoginEvent {

    //登录名
    private String loginName;
    //用户唯一编码
    private String userCode;
   
    
	public LoginEvent(String loginName, String userCode) {
		super();
		this.loginName = loginName;
		this.userCode = userCode;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	@Override
	public String toString() {
		return "LoginEvent [loginName=" + loginName + ", userCode=" + userCode + "]";
	}
	

}
