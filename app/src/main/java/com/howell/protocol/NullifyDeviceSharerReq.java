package com.howell.protocol;

public class NullifyDeviceSharerReq {
	private String account;
	private String loginSession;
	private String devID;
	private int channelNo;
	private String sharerAccount;
	public NullifyDeviceSharerReq(String account, String loginSession,
			String devID, int channelNo, String sharerAccount) {
		super();
		this.account = account;
		this.loginSession = loginSession;
		this.devID = devID;
		this.channelNo = channelNo;
		this.sharerAccount = sharerAccount;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getLoginSession() {
		return loginSession;
	}
	public void setLoginSession(String loginSession) {
		this.loginSession = loginSession;
	}
	public String getDevID() {
		return devID;
	}
	public void setDevID(String devID) {
		this.devID = devID;
	}
	public int getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(int channelNo) {
		this.channelNo = channelNo;
	}
	public String getSharerAccount() {
		return sharerAccount;
	}
	public void setSharerAccount(String sharerAccount) {
		this.sharerAccount = sharerAccount;
	}

}	