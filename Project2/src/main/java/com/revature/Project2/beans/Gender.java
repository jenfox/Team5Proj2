package com.revature.Project2.beans;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table (name = "GENDER")
public class Gender implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "G_ID")
	private int gID; // gender ID
	
	@Column(name = "GENDER")
	private String gender;

	public Gender() {
		super();
	}

	public Gender(String gender) {
		super();
		this.gender = gender;
	}

	public int getGID() {
		return gID;
	}

	public void setGID(int gID) {
		this.gID = gID;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Gender [gID=" + gID + ", gender=" + gender + "]";
	}

}
