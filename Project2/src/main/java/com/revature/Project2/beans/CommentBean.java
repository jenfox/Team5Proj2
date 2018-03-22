package com.revature.Project2.beans;

import java.io.Serializable;

import javax.persistence.*;

/**
 * 
 * @author johne Vang
 * @author Matthew Butler
 *
 */

@Entity
@Table(name = "COMMENT")
public class CommentBean implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "C_ID")
	private int cID;

	@Column(name = "C_AUTHORID")
	@ManyToOne
	@JoinColumn(name = "U_ID")
	private int cAuthorID;

	@Column(name = "C_RECEIVERID")
	@ManyToOne
	@JoinColumn(name = "C_ID")
	private int cRecieverID;

	@Column(name = "C_POSTID")
	@ManyToOne
	@JoinColumn(name = "P_ID")
	private int cPostID;

	@Column(name = "C_CONTENT")
	private String content;

	public CommentBean() {
		super();
	}

	public CommentBean(int cID, int cAuthorID, int cRecieverID, int cPostID, String content) {
		super();
		this.cID = cID;
		this.cAuthorID = cAuthorID;
		this.cRecieverID = cRecieverID;
		this.cPostID = cPostID;
		this.content = content;
	}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public int getcAuthorID() {
		return cAuthorID;
	}

	public void setcAuthorID(int cAuthorID) {
		this.cAuthorID = cAuthorID;
	}

	public int getcRecieverID() {
		return cRecieverID;
	}

	public void setcRecieverID(int cRecieverID) {
		this.cRecieverID = cRecieverID;
	}

	public int getcPostID() {
		return cPostID;
	}

	public void setcPostID(int cPostID) {
		this.cPostID = cPostID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "CommentBean [cID=" + cID + ", cAuthorID=" + cAuthorID + ", cRecieverID=" + cRecieverID + ", cPostID="
				+ cPostID + ", content=" + content + "]";
	}

}
