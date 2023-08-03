package com.tmb.config;




public final class ConFigFactory {
	//protected FrameworkConfig config;
	
	private ConFigFactory() {
		
	}
	public  static FrameworkConfig getConfig() {
		return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);

	}

}
