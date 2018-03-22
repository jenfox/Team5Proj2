package com.revature.Project2.beans;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table (name = "SEXORIENTATION")
public class SexOrientation implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "SEXORIENT_ID")
	private int sexOrientID;
	
	@Column(name = "SEXORIENTATION")
	private String sexOrientation;

	public SexOrientation() {
		super();
	}

	public SexOrientation(String sexOrientation) {
		super();
		this.sexOrientation = sexOrientation;
	}

	public int getSexOrientID() {
		return sexOrientID;
	}

	public void setSexOrient_ID(int sexOrientID) {
		this.sexOrientID = sexOrientID;
	}

	public String getSexOrientation() {
		return sexOrientation;
	}

	public void setSexOrientation(String sexOrientation) {
		this.sexOrientation = sexOrientation;
	}

	@Override
	public String toString() {
		return "SexOrientation [sexOrientID=" + sexOrientID + ", sexOrientation=" + sexOrientation + "]";
	}

}
