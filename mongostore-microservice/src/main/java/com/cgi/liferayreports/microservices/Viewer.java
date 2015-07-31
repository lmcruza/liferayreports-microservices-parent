package com.cgi.liferayreports.microservices;

public class Viewer {
    private Long userId;
    private String userEmail;
    private String session;

    public Viewer(Long userId, String userEmail) {
	super();
	this.userId = userId;
	this.userEmail = userEmail;
    }

    public Long getUserId() {
	return userId;
    }

    public String getUserEmail() {
	return userEmail;
    }

    public String getSession() {
	return session;
    }

    public void setSession(String session) {
	this.session = session;
    }
    
    @Override
    public String toString() {
	return "Viewer [userId=" + userId + ", userEmail=" + userEmail + ", session=" + session + "]";
    }

    public Viewer(){
    }
}
