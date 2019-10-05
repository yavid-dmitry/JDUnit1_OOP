package by.htp.task10.task05.service;

import by.htp.task10.task05.bean.*;

public interface GiftService {

	public Gift createGift(String name);

	public boolean addCover(Gift gift, String name, int price) throws ServiceException;

	public boolean addSweet(Gift gift, String name, int price) throws ServiceException;


}