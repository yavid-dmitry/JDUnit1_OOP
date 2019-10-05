package by.htp.task10.task05.Command.impl;

import by.htp.task10.task05.Command.*;
import by.htp.task10.task05.bean.Gift;
import by.htp.task10.task05.service.*;

public class CreateGiftCommand implements Command {

	@Override
	public String execute(String request) {
		String[] parameters;
		Gift gift;
		parameters = request.split(" ");

		String name;

		name = parameters[1].split("=")[1];

		ServiceProvider provider = ServiceProvider.getInstance();
		GiftService giftCreator = provider.getGiftService();

		String response;

		gift = giftCreator.createGift(name);
		response = "Букет создан";

		return response;
	}

}