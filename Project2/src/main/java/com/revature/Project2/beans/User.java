package com.revature.Project2.beans;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "U_ID")
	private int uID;

	@Column(name = "U_EMAIL", unique = true)
	private String uEmail; // unique

	@Column(name = "U_PASSWORD")
	private String uPassword;

	@Column(name = "U_FIRSTNAME")
	private String uFirstName;

	@Column(name = "U_LASTNAME")
	private String uLastName;

	@Column(name = "U_GENDERID")
	@JoinColumn(name = "G_ID")
	private Gender uGenderID;

	@Column(name = "U_SEXORIENTID")
	@JoinColumn(name = "SEXORIENT_ID")
	private SexOrientation uSexOrientID;

	@Column(name = "U_PHONENUMBER")
	private String uPhoneNumber;

	@Column(name = "U_DATEOFBIRTH")
	private Date uDOB; // date of birth

	@Column(name = "IMAGEURL")
	private String uProfilePic;

	public User() {
		super();
	}

	public User(int uID, String uEmail, String uPassword, String uFirstName, String uLastName, Gender uGenderID,
			SexOrientation uSexOrientID, String uPhoneNumber, Date uDOB, String uProfilePic) {
		super();
		this.uID = uID;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
		this.uFirstName = uFirstName;
		this.uLastName = uLastName;
		this.uGenderID = uGenderID;
		this.uSexOrientID = uSexOrientID;
		this.uPhoneNumber = uPhoneNumber;
		this.uDOB = uDOB;
		this.uProfilePic = uProfilePic;
	}

	public int getuID() {
		return uID;
	}

	public void setuID(int uID) {
		this.uID = uID;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuFirstName() {
		return uFirstName;
	}

	public void setuFirstName(String uFirstName) {
		this.uFirstName = uFirstName;
	}

	public String getuLastName() {
		return uLastName;
	}

	public void setuLastName(String uLastName) {
		this.uLastName = uLastName;
	}

	public Gender getuGenderID() {
		return uGenderID;
	}

	public void setuGenderID(Gender uGenderID) {
		this.uGenderID = uGenderID;
	}

	public SexOrientation getuSexOrientID() {
		return uSexOrientID;
	}

	public void setuSexOrientID(SexOrientation uSexOrientID) {
		this.uSexOrientID = uSexOrientID;
	}

	public String getuPhoneNumber() {
		return uPhoneNumber;
	}

	public void setuPhoneNumber(String uPhoneNumber) {
		this.uPhoneNumber = uPhoneNumber;
	}

	public Date getuDOB() {
		return uDOB;
	}

	public void setuDOB(Date uDOB) {
		this.uDOB = uDOB;
	}

	public String getuProfilePic() {
		return uProfilePic;
	}

	public void setuProfilePic(String uProfilePic) {
		this.uProfilePic = uProfilePic;
	}

	@Override
	public String toString() {
		return "User [uID=" + uID + ", uEmail=" + uEmail + ", uPassword=" + uPassword + ", uFirstName=" + uFirstName
				+ ", uLastName=" + uLastName + ", uGenderID=" + uGenderID + ", uSexOrientID=" + uSexOrientID
				+ ", uPhoneNumber=" + uPhoneNumber + ", uDOB=" + uDOB + ", uProfilePic=" + uProfilePic + "]";
	}

}
