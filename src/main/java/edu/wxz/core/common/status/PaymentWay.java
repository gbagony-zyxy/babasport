package edu.wxz.core.common.status;

public enum PaymentWay {

	COD {
		@Override
		public String getName() {
			return "货到付款";
		}
	},
	POO {
		@Override
		public String getName() {
			return "在线支付";
		}
	},
	CAT {
		@Override
		public String getName() {
			return "公司转账";
		}
	},
	PT {
		@Override
		public String getName() {
			return "邮局汇款";
		}
	},
	OTHER {
		@Override
		public String getName() {
			return "其他";
		}
	};
	
	public abstract String getName();
}
