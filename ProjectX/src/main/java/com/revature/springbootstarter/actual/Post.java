package com.revature.springbootstarter.actual;

/**
 * It's a POST POJO!
 */
public class Post {
	// matching it to the ts post currently
	// TODO add some of the actual db beanness
	private String description;

	public Post() {

	}

	public Post(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
