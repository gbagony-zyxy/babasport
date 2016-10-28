package edu.wxz.core.bean.user;

public enum Gender {

	Male{
		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return "男";
		}
	},
	Female{
		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return "女";
		}
	},
	SECRECY{
		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return "保密";
		}
	};
	
	public abstract String getName();
}
