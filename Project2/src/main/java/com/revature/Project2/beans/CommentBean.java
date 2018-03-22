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
	private int c_id;
	
	@Column(name = "C_AUTHORID")
	@ManyToOne
	@JoinColumn (name = "U_ID")
	private int c_authorId;
	
	@Column(name = "C_RECEIVERID")
	@ManyToOne
	@JoinColumn (name = "C_ID")
	private int c_recieverId;
	
	@Column (name = "C_POSTID")
	@ManyToOne
	@JoinColumn (name = "P_ID")
	private int c_postId;
	
	@Column(name = "C_CONTENT")
	private String c_content;
	
	public CommentBean() {
		super();
	}
	
	public CommentBean(int c_id, int c_authorId, int c_recieverId, int c_postId, String c_content) {
		super();
		this.c_id = c_id;
		this.c_authorId = c_authorId;
		this.c_recieverId = c_recieverId;
		this.c_postId = c_postId;
		this.c_content = c_content;
	}

	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getC_authorId() {
		return c_authorId;
	}
	public void setC_authorId(int c_authorId) {
		this.c_authorId = c_authorId;
	}
	public int getC_recieverId() {
		return c_recieverId;
	}
	public void setC_recieverId(int c_recieverId) {
		this.c_recieverId = c_recieverId;
	}
	public int getC_postId() {
		return c_postId;
	}
	public void setC_postId(int c_postId) {
		this.c_postId = c_postId;
	}
	public String getC_content() {
		return c_content;
	}
	public void setC_content(String c_content) {
		this.c_content = c_content;
	}
	@Override
	public String toString() {
		return "CommentBean [c_id=" + c_id + ", c_authorId=" + c_authorId + ", c_recieverId=" + c_recieverId
				+ ", c_postId=" + c_postId + ", c_content=" + c_content + "]";
	}
	
	
}
