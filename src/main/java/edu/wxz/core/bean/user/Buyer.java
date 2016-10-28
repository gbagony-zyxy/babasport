package edu.wxz.core.bean.user;

import java.io.Serializable;
import java.util.Date;

public class Buyer implements Serializable {

	private static final long serialVersionUID = 5837839583490585057L;

	private String username;
	private String password;
	private Gender gender;
	private String email;
	private String realname;
	private Date registerTime;
	private String province;
	private String city;
	private String town;
	private String addr;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	@Override
	public String toString() {
		return "Buyer [username=" + username + ", password=" + password + ", gender=" + gender + ", email=" + email
				+ ", realname=" + realname + ", registerTime=" + registerTime + ", province=" + province + ", city="
				+ city + ", town=" + town + ", addr=" + addr + ", isDel=" + isDel + "]";
	}
}
