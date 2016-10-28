package edu.wxz.core.common.status;

public enum PaymentStatus {

	PamentAtDestination {
		@Override
		public String getName() {
			return "货到到付";
		}
	},
	Paid {
		@Override
		public String getName() {
			return "已付款";
		}
	},
	UnPaid {
		@Override
		public String getName() {
			return "未付款";
		}
	},
	Refund {
		@Override
		public String getName() {
			return "退款";
		}
	},
	RefundSuccess {
		@Override
		public String getName() {
			return "退款成功";
		}
	},
	RefundFailed {
		@Override
		public String getName() {
			return "退款失败";
		}
	};
	
	
	public abstract String getName();
}
