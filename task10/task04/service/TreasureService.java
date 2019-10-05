package by.htp.task10.task04.service;

import java.util.List;

import by.htp.task10.task04.bean.Treasure;


public interface TreasureService {

	public List<Treasure> showTreasure() throws ServiceException;

	public Treasure getMaximumExpensiveTreasure() throws ServiceException;

	public List<Treasure> getSumTreasure(int value) throws ServiceException;
}