package com.revature.Project2.beans;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="USER")
public class User implements Serializable {
	
	@Id 
	@GeneratedValue
	@Column(name="U_ID")
	private int u_id;
	
	@Column(name = "U_EMAIL", unique = true)
	private String u_email;		//unique
	
	@Column(name = "U_PASSWORD")
	private String u_password;

	@Column(name = "U_FIRSTNAME")
	private String u_firstName;
	
	@Column(name = "U_LASTNAME")
	private String u_lastName;
	
	@Column(name = "U_GENDERID")
	@JoinColumn ( name = "G_ID")
	private Gender u_genderID;
	
	@Column(name = "U_SEXORIENTID")
	@JoinColumn( name = "SEXORIENT_ID")
	private SexOrientation u_sexOrientID;

	@Column(name = "U_PHONENUMBER")
	private String u_phoneNumber;
	
	@Column(name = "U_DATEOFBIRTH")
	private Date u_dateOfBirth;
	
	@Column(name = "IMAGEURL")
	private String imageURL;

	public User() {
		super();
	}

	public User(String u_email, String u_password, String u_firstName, String u_lastName,
			Gender u_genderID, SexOrientation u_sexOrientID, String u_phoneNumber, Date u_dateOfBirth,
			String imageURL) {
		super();
		this.u_email = u_email;
		this.u_password = u_password;
		this.u_firstName = u_firstName;
		this.u_lastName = u_lastName;
		this.u_genderID = u_genderID;
		this.u_sexOrientID = u_sexOrientID;
		this.u_phoneNumber = u_phoneNumber;
		this.u_dateOfBirth = u_dateOfBirth;
		this.imageURL = imageURL;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public String getU_firstName() {
		return u_firstName;
	}

	public void setU_firstName(String u_firstName) {
		this.u_firstName = u_firstName;
	}

	public String getU_lastName() {
		return u_lastName;
	}

	public void setU_lastName(String u_lastName) {
		this.u_lastName = u_lastName;
	}

	public Gender getU_genderID() {
		return u_genderID;
	}

	public void setU_genderID(Gender u_genderID) {
		this.u_genderID = u_genderID;
	}

	public SexOrientation getU_sexOrientID() {
		return u_sexOrientID;
	}

	public void setU_sexOrientID(SexOrientation u_sexOrientID) {
		this.u_sexOrientID = u_sexOrientID;
	}

	public String getU_phoneNumber() {
		return u_phoneNumber;
	}

	public void setU_phoneNumber(String u_phoneNumber) {
		this.u_phoneNumber = u_phoneNumber;
	}

	public Date getU_dateOfBirth() {
		return u_dateOfBirth;
	}

	public void setU_dateOfBirth(Date u_dateOfBirth) {
		this.u_dateOfBirth = u_dateOfBirth;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_email=" + u_email + ", u_password=" + u_password + ", u_firstName="
				+ u_firstName + ", u_lastName=" + u_lastName + ", u_genderID=" + u_genderID + ", u_sexOrientID="
				+ u_sexOrientID + ", u_phoneNumber=" + u_phoneNumber + ", u_dateOfBirth=" + u_dateOfBirth
				+ ", imageURL=" + imageURL + "]";
	}

}
