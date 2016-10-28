package edu.wxz.core.bean.product;

import java.io.Serializable;

/**
 * 图片
 */
public class Img implements Serializable {

	private static final long serialVersionUID = 6365542699719052463L;

	private Integer id;
	private Integer productId;
	private String url;
	private Integer isDef;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getIsDef() {
		return isDef;
	}

	public void setIsDef(Integer isDef) {
		this.isDef = isDef;
	}

}
