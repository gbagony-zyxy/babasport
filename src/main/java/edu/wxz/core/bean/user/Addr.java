package edu.wxz.core.bean.user;

import java.io.Serializable;

import edu.wxz.core.bean.address.City;

/**
 * 地址
 */
public class Addr implements Serializable {

	private static final long serialVersionUID = 2732752258760787278L;

	private Integer id;
	private String buyerId;
	private String name;
	private City city;
	private String addr;
	private String phone;
	private Integer isDef;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getIsDef() {
		return isDef;
	}

	public void setIsDef(Integer isDef) {
		this.isDef = isDef;
	}

	@Override
	public String toString() {
		return "Addr [id=" + id + ", buyerId=" + buyerId + ", name=" + name + ", city=" + city + ", addr=" + addr
				+ ", phone=" + phone + ", isDef=" + isDef + "]";
	}

}
