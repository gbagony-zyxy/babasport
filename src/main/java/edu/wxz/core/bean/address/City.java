package edu.wxz.core.bean.address;

import java.io.Serializable;

/**
 * 市对象
 */
public class City implements Serializable {

	private static final long serialVersionUID = -6187150236106009546L;

	private Integer id;
	private String code;
	private String name;
	private Province province;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", code=" + code + ", name=" + name + ", province=" + province + "]";
	}

}
