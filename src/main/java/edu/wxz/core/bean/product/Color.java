package edu.wxz.core.bean.product;

import java.io.Serializable;

/**
 * 颜色
 */
public class Color implements Serializable {

	private static final long serialVersionUID = -6664995444153798621L;

	private Integer id;
	private String name;
	private Integer parentId;
	private String imgUrl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
