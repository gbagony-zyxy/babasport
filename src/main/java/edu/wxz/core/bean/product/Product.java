package edu.wxz.core.bean.product;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品列表
 */
public class Product implements Serializable {

	private static final long serialVersionUID = 6183065783610914689L;

	private Integer id;
	private String no;
	private String name;
	private double weight;
	private Integer isNew = 0;
	private Integer isHot = 0;
	private Integer isCommend = 0;
	private Date createTime;
	private String createUserId;
	private Date checkTime;
	private String checkUserId;
	private Integer isShow;
	private Integer isDel;
	private Integer typeId;
	private Integer brandId;
	private String keywords;
	private Integer sales;
	private String description;
	private String packageList;
	private String feature;
	private Color color;
	private String size; // S,L,XXL

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public Integer getIsCommend() {
		return isCommend;
	}

	public void setIsCommend(Integer isCommend) {
		this.isCommend = isCommend;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckUserId() {
		return checkUserId;
	}

	public void setCheckUserId(String checkUserId) {
		this.checkUserId = checkUserId;
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPackageList() {
		return packageList;
	}

	public void setPackageList(String packageList) {
		this.packageList = packageList;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", no=" + no + ", name=" + name + ", weight=" + weight + ", isNew=" + isNew
				+ ", isHot=" + isHot + ", isCommend=" + isCommend + ", createTime=" + createTime + ", createUserId="
				+ createUserId + ", checkTime=" + checkTime + ", checkUserId=" + checkUserId + ", isShow=" + isShow
				+ ", isDel=" + isDel + ", typeId=" + typeId + ", brandId=" + brandId + ", keywords=" + keywords
				+ ", sales=" + sales + ", description=" + description + ", packageList=" + packageList + ", feature="
				+ feature + ", color=" + color + ", size=" + size + "]";
	}

}
