package by.htp.task10.task05.service;

import by.htp.task10.task05.service.impl.*;

public class ServiceProvider {
	
	private static final ServiceProvider instance = new ServiceProvider();
	
	private ServiceProvider() {};
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private GiftService giftService = new GiftServiceImpl();
	
	public GiftService getGiftService() {
		return giftService;
	}

}