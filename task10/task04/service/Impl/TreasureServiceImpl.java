package by.htp.task10.task04.service.Impl;

import java.util.*;


import by.htp.task10.task04.bean.Treasure;
import by.htp.task10.task04.dao.DAOException;
import by.htp.task10.task04.dao.DAOProvider;
import by.htp.task10.task04.service.ServiceException;
import by.htp.task10.task04.service.TreasureService;

public class TreasureServiceImpl implements TreasureService {

	@Override
	public List<Treasure> showTreasure() throws ServiceException {
		DAOProvider provider = DAOProvider.getInstance();
		List<Treasure> showTreasure;
		

		try {
			showTreasure = provider.getTreasureDao().takeTreasure();
		
		} catch (DAOException e) {
			
			throw new ServiceException(e);
		}
		return showTreasure;
	}

	@Override
	public Treasure getMaximumExpensiveTreasure() throws ServiceException {
		Treasure treasure = new Treasure();

		DAOProvider provider = DAOProvider.getInstance();

		try {
			for (Treasure t : provider.getTreasureDao().takeTreasure()) {
				if (treasure.getValue() < t.getValue()) {
					treasure = t;
				}
			}
		} catch (DAOException e) {
			
			throw new ServiceException(e);
		}

		return tr;
	}

	@Override
	public List<Treasure> getSumTreasure(int value) throws ServiceException {
		DAOProvider provider = DAOProvider.getInstance();
		List<Treasure> treasures = new ArrayList<>();
		int sum = 0;

		try {
			
			for (Treasure treasure : provider.getTreasureDao().takeTreasure()) {
				sum = sum + treasure.getValue();
				if(sum <= value) {
				treasures.add(treasure);
				}
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return treasures;
	}

}