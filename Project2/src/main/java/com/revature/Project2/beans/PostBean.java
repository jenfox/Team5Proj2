package com.revature.Project2.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * 
 * @author johne Vang
 * @author Matthew Butler
 *
 */

@Entity
@Table(name = "POST")
public class PostBean implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "P_ID")
	private int p_id;
	
	@Column(name = "P_LIKES")
	private List<User> p_likes;
	
	@Column(name = "P_CONTENT")
	private String p_content;
	
	@Column(name = "P_YTUBE")
	private String p_ytube;
	
	@Column(name = "IMAGEURL")
	private String p_imageURL;
	
	@Column(name = "P_AUTHORID")
	@ManyToOne
	@JoinColumn(name = "U_ID")
	private int p_authorId;	
	
	
	public PostBean() {
		super();
	}
	
	public PostBean(List<User> p_likes, String p_content, String p_ytube, String p_imageURL,
			int p_authorId) {
		super();
		this.p_likes = p_likes;
		this.p_content = p_content;
		this.p_ytube = p_ytube;
		this.p_imageURL = p_imageURL;
		this.p_authorId = p_authorId;
	}

	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public List<User> getP_likes() {
		return p_likes;
	}
	public void setP_likes(List<User> p_likes) {
		this.p_likes = p_likes;
	}
	public String getP_content() {
		return p_content;
	}
	public void setP_content(String p_content) {
		this.p_content = p_content;
	}
	public String getP_ytube() {
		return p_ytube;
	}
	public void setP_ytube(String p_ytube) {
		this.p_ytube = p_ytube;
	}
	public String getP_imageURL() {
		return p_imageURL;
	}
	public void setP_imageURL(String p_imageURL) {
		this.p_imageURL = p_imageURL;
	}
	public int getP_authorId() {
		return p_authorId;
	}
	public void setP_authorId(int p_authorId) {
		this.p_authorId = p_authorId;
	}

	@Override
	public String toString() {
		return "PostBean [p_id=" + p_id + ", p_likes=" + p_likes + ", p_content=" + p_content + ", p_ytube=" + p_ytube
				+ ", p_imageURL=" + p_imageURL + ", p_authorId=" + p_authorId + "]";
	}
	
	
	
}