package edu.wxz.core.query.user;

import java.util.ArrayList;
import java.util.List;

import edu.wxz.core.bean.user.Addr;
import edu.wxz.core.query.BaseQuery;

/**
 *	地址条件对象 
 */
public class AddrQuery extends BaseQuery{

	private static final long serialVersionUID = 8762554394353839264L;
	
	private Addr addr;
	public Addr getAddr() {
		return addr;
	}
	
	public AddrQuery setAddr(Addr addr) {
		this.addr = addr;
		return this;
	}
	
	/**
	 *	批量查询时的Order条件顺序设置 
	 */
	public class OrderField{
		private String fieldname;
		private String order;
		
		public OrderField(String fieldname,String order) {
			this.fieldname = fieldname;
			this.order = order;
		}
		
		public String getFieldname() {
			return fieldname;
		}
		
		public OrderField setFieldname(String fieldname) {
			this.fieldname = fieldname;
			return this;
		}
		
		public String getOrder() {
			return order;
		}
		
		public OrderField setOrder(String order) {
			this.order = order;
			return this;
		}
	}
	
	/**
	 * 批量查询时的Order条件顺序设置 
	 */
	//排序列表字段
	private List<OrderField> orderFields = new ArrayList<>();
	//设置排序属性(id,buyer_id,name,city)
	public AddrQuery orderById(boolean isAsc){
		orderFields.add(new OrderField("id", isAsc?"ASC":"DESC"));
		return this;
	}
	
	public AddrQuery orderByBuyerId(boolean isAsc){
		orderFields.add(new OrderField("buyer_id", isAsc?"ASC":"DESC"));
		return this;
	}
}
