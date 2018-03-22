package com.revature.Project2.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "POST")
public class PostBean implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "P_ID")
	private int pID;

	@Column(name = "P_LIKES")
	private List<User> pLikes;

	@Column(name = "P_CONTENT")
	private String pContent;

	@Column(name = "P_YTUBE")
	private String pYTube;

	@Column(name = "IMAGEURL")
	private String pImageURL;

	@Column(name = "P_AUTHORID")
	@ManyToOne
	@JoinColumn(name = "U_ID")
	private int pAuthorId;

	public PostBean() {
		super();
	}

	public PostBean(int pID, List<User> pLikes, String pContent, String pYTube, String pImageURL, int pAuthorId) {
		super();
		this.pID = pID;
		this.pLikes = pLikes;
		this.pContent = pContent;
		this.pYTube = pYTube;
		this.pImageURL = pImageURL;
		this.pAuthorId = pAuthorId;
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public List<User> getpLikes() {
		return pLikes;
	}

	public void setpLikes(List<User> pLikes) {
		this.pLikes = pLikes;
	}

	public String getpContent() {
		return pContent;
	}

	public void setpContent(String pContent) {
		this.pContent = pContent;
	}

	public String getpYTube() {
		return pYTube;
	}

	public void setpYTube(String pYTube) {
		this.pYTube = pYTube;
	}

	public String getpImageURL() {
		return pImageURL;
	}

	public void setpImageURL(String pImageURL) {
		this.pImageURL = pImageURL;
	}

	public int getpAuthorId() {
		return pAuthorId;
	}

	public void setpAuthorId(int pAuthorId) {
		this.pAuthorId = pAuthorId;
	}

	@Override
	public String toString() {
		return "PostBean [pID=" + pID + ", pLikes=" + pLikes + ", pContent=" + pContent + ", pYTube=" + pYTube
				+ ", pImageURL=" + pImageURL + ", pAuthorId=" + pAuthorId + "]";
	}

}