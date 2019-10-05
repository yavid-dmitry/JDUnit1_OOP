package by.htp.task10.task04.service;

import by.htp.task10.task04.service.Impl.TreasureServiceImpl;

public class ServiceProvider {
	
	private static final ServiceProvider INSTANCE = new ServiceProvider();
		
	private ServiceProvider() {}

	public static ServiceProvider getInstance() {
		return INSTANCE;
	}
	
	private TreasureService treasureService = new TreasureServiceImpl();
	
	public TreasureService getTreasureService () {
		return treasureService;
	}
	
	

}