package com.tsr.beans;

public class ConnectionManager {
	
	private String driverClassname;
	private String url;
	private String username;
	private String password;
	
	public ConnectionManager() {
		super();
	}

	public String getDriverClassname() {
		return driverClassname;
	}

	public void setDriverClassname(String driverClassname) {
		this.driverClassname = driverClassname;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ConnectionManager [driverClassname=" + driverClassname + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}
	
}
