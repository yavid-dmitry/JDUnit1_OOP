package by.htp.task10.task04.dao;

import by.htp.task10.task04.dao.impl.TreasureFile;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return instance;
	}

	private TreasureDAO treasureDao = new TreasureFile();

	public TreasureDAO getTreasureDao() {
		return treasureDao;
	}

}