package edu.wxz.core.bean.address;

import java.io.Serializable;

/**
 * 区/县
 */
public class Town implements Serializable {

	private static final long serialVersionUID = 5260225371793328270L;

	private Integer id;
	private String code;
	private String name;
	private City city;

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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Town [id=" + id + ", code=" + code + ", name=" + name + ", city=" + city + "]";
	}

}
