package edu.wxz.core.bean.order;

import java.io.Serializable;
import java.util.Date;

import edu.wxz.core.common.status.DeliveryDate;
import edu.wxz.core.common.status.OrderState;
import edu.wxz.core.common.status.PaymentCash;
import edu.wxz.core.common.status.PaymentStatus;
import edu.wxz.core.common.status.PaymentWay;

public class Order implements Serializable {

	private static final long serialVersionUID = -5449750046047192582L;

	private Integer id;
	private String oid;
	private Double deliverFee;
	private Double payableFee;
	private Double totalPrice;
	private PaymentWay paymentWay;
	private PaymentCash paymentCash;
	private DeliveryDate deliveryDate;
	private Integer isConfirm;
	private PaymentStatus paymentStatus;
	private OrderState orderState;
	private Date createDate;
	private String note;
	private String buyerId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Double getDeliverFee() {
		return deliverFee;
	}

	public void setDeliverFee(Double deliverFee) {
		this.deliverFee = deliverFee;
	}

	public Double getPayableFee() {
		return payableFee;
	}

	public void setPayableFee(Double payableFee) {
		this.payableFee = payableFee;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public PaymentWay getPaymentWay() {
		return paymentWay;
	}

	public void setPaymentWay(PaymentWay paymentWay) {
		this.paymentWay = paymentWay;
	}

	public PaymentCash getPaymentCash() {
		return paymentCash;
	}

	public void setPaymentCash(PaymentCash paymentCash) {
		this.paymentCash = paymentCash;
	}

	public DeliveryDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(DeliveryDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public OrderState getOrderState() {
		return orderState;
	}

	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}

	public Integer getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Integer isConfirm) {
		this.isConfirm = isConfirm;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", oid=" + oid + ", deliverFee=" + deliverFee + ", payableFee=" + payableFee
				+ ", totalPrice=" + totalPrice + ", paymentWay=" + paymentWay + ", paymentCash=" + paymentCash
				+ ", deliveryDate=" + deliveryDate + ", isConfirm=" + isConfirm + ", paymentStatus=" + paymentStatus
				+ ", orderState=" + orderState + ", createDate=" + createDate + ", note=" + note + ", buyerId="
				+ buyerId + "]";
	}

}
