package com.revature.Project2.beans;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "NOTIFICATION")
public class Notification implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "N_ID")
	private int notificationID;

	@Column(name = "USER_ID")
	@ManyToOne
	@JoinColumn(name = "U_ID")
	private int nUserID;

	@Column(name = "N_CONTENT")
	private String nContent;

	@Column(name = "N_ROUTEURL")
	private String nRouteURL;

	public Notification() {
		super();
	}

	public Notification(int notificationID, int nUserID, String nContent, String nRouteURL) {
		super();
		this.notificationID = notificationID;
		this.nUserID = nUserID;
		this.nContent = nContent;
		this.nRouteURL = nRouteURL;
	}

	public int getNotificationID() {
		return notificationID;
	}

	public void setNotificationID(int notificationID) {
		this.notificationID = notificationID;
	}

	public int getnUserID() {
		return nUserID;
	}

	public void setnUserID(int nUserID) {
		this.nUserID = nUserID;
	}

	public String getnContent() {
		return nContent;
	}

	public void setnContent(String nContent) {
		this.nContent = nContent;
	}

	public String getnRouteURL() {
		return nRouteURL;
	}

	public void setnRouteURL(String nRouteURL) {
		this.nRouteURL = nRouteURL;
	}

	@Override
	public String toString() {
		return "Notification [notificationID=" + notificationID + ", nUserID=" + nUserID + ", nContent=" + nContent
				+ ", nRouteURL=" + nRouteURL + "]";
	}

}
