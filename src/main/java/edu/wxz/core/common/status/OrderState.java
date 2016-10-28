package edu.wxz.core.common.status;

public enum OrderState {

	CommittedOrder {
		@Override
		public String getName() {
			return "提交订单";
		}
	},
	RepoPrepared {
		@Override
		public String getName() {
			return "仓库配货";
		}
	},
	GoodsDelivery {
		@Override
		public String getName() {
			return "商品出库";
		}
	},
	WaitForGoods {
		@Override
		public String getName() {
			return "等待收货";
		}
	},
	HaveReceivedGoods {
		@Override
		public String getName() {
			return "已收货";
		}
	},
	RetunrGoods {
		@Override
		public String getName() {
			return "待退货";
		}
	},
	DoReturnGoods {
		@Override
		public String getName() {
			return "已退货";
		}
	},
	CancelGoods {
		@Override
		public String getName() {
			return "已取消";
		}
	},
	OtherScene {
		@Override
		public String getName() {
			return "未知状态";
		}
	};

	public abstract String getName();
}
