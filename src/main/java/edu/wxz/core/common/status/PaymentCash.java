package edu.wxz.core.common.status;

public enum PaymentCash {
	
	Cash {
		@Override
		public String getName() {
			return "现金";
		}
	},
	POS {
		@Override
		public String getName() {
			return "POS机";
		}
	};
	
	public abstract String getName();
}
