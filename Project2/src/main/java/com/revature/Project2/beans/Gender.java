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
@Table (name = "GENDER")
public class Gender implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "G_ID")
	private int g_id; // gender ID
	
	@Column(name = "GENDER")
	private String gender;

	public Gender() {
		super();
	}

	public Gender(String gender) {
		super();
		this.gender = gender;
	}

	public int getG_id() {
		return g_id;
	}

	public void setG_id(int g_id) {
		this.g_id = g_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Gender [g_id=" + g_id + ", gender=" + gender + "]";
	}

}
