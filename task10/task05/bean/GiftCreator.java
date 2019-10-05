package by.htp.task10.task05.bean;

import java.util.ArrayList;
import java.util.List;

public class GiftCreator {
	
	private static final GiftCreator INSTANCE = new GiftCreator();
		
	private List<Gift> gifts;

	private GiftCreator() {
		this.gifts = new ArrayList<Gift>();
	}
	
	public List<Gift> getGifts() {
		return gifts;
	}



	public static GiftCreator getInstance() {
		return INSTANCE;
	}
}
	
