package edu.wxz.core.common.status;

public enum DeliveryDate {

	AllDayAvailable {
		@Override
		public String getName() {
			return "工作日，双休日，假日均可送货";
		}
	},
	OnlyForWeekends {
		@Override
		public String getName() {
			return "只双休日，假日送货";
		}
	},
	OnlyForWorkDay {
		@Override
		public String getName() {
			return "只工作日送货(双休日，节假日不送)";
		}
	};
	
	public abstract String getName();
}
