package com.revature.Project2.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "NOTIFICATION")
public class Notification implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "N_ID")
	private int n_id;
	
	@Column(name = "N_CONTENT")
	private String n_content;
	
	@Column(name = "N_ROUTEURL")
	private String n_routeURL;
	
	public Notification() {
		super();
	}

	public Notification(String n_content, String n_routeURL) {
		super();
		this.n_content = n_content;
		this.n_routeURL = n_routeURL;
	}

	public int getN_id() {
		return n_id;
	}

	public void setN_id(int n_id) {
		this.n_id = n_id;
	}

	public String getN_content() {
		return n_content;
	}

	public void setN_content(String n_content) {
		this.n_content = n_content;
	}

	public String getn_routeURL() {
		return n_routeURL;
	}

	public void setn_routeURL(String n_routeURL) {
		this.n_routeURL = n_routeURL;
	}

	@Override
	public String toString() {
		return "Notification [n_id=" + n_id + ", n_content=" + n_content + ", n_routeURL=" + n_routeURL + "]";
	}
	
	
}
