package com.revature.Project2.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name = "SEXORIENTATION")
public class SexOrientation implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "SEXORIENT_ID")
	private int sexOrient_ID;
	
	@Column(name = "SEXORIENTATION")
	private String sexOrientation;

	public SexOrientation() {
		super();
	}

	public SexOrientation(String sexOrientation) {
		super();
		this.sexOrientation = sexOrientation;
	}

	public int getSexOrient_ID() {
		return sexOrient_ID;
	}

	public void setSexOrient_ID(int sexOrient_ID) {
		this.sexOrient_ID = sexOrient_ID;
	}

	public String getSexOrientation() {
		return sexOrientation;
	}

	public void setSexOrientation(String sexOrientation) {
		this.sexOrientation = sexOrientation;
	}

}
