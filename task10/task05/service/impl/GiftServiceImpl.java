package by.htp.task10.task05.service.impl;

import by.htp.task10.task05.bean.*;
import by.htp.task10.task05.service.*;
import by.htp.task10.task05.service.util.*;

public class GiftServiceImpl implements GiftService {

	@Override
	public Gift createGift(String name)  {
		return new Gift(String name);
	}

	@Override
	public boolean addCover(Gift gift, String name, int price) throws ServiceException {

		if (!Validator.validParameter(name, price)) {
			throw new ServiceException("Названия или цена указано не верно");
		}

		Cover cover = new Cover(name, price);
		gift.setCover(cover);

		return true;
	}

	@Override
	public boolean addSweet(Gift gift, String name, int price) throws ServiceException {
		if (!Validator.validParameter(name, price)) {
			throw new ServiceException("Название или цена указаны с ошибкой");
		}

		Sweet sweet = new Sweet(name, price);
		gift.getGiftList().add(sweet);

		return true;
	}

}