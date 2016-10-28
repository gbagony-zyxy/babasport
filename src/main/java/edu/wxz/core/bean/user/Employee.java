package edu.wxz.core.bean.user;

import java.io.Serializable;

/**
 * 员工
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 6472488426658228881L;

	private String username;
	private String password;
	private String degree;
	private String email;
	private Gender gender;
	private String imgUrl;
	private String phone;
	private String realname;
	private String school;
	private Integer isDel;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + ", degree=" + degree + ", email=" + email
				+ ", gender=" + gender + ", imgUrl=" + imgUrl + ", phone=" + phone + ", realname=" + realname
				+ ", school=" + school + ", isDel=" + isDel + "]";
	}

}
