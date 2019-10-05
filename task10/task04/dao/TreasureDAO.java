package by.htp.task10.task04.dao;

import java.util.List;

import by.htp.task10.task04.bean.Cave;
import by.htp.task10.task04.bean.Treasure;

public interface TreasureDAO {
	
	List<Treasure> takeTreasure () throws DAOException;
	
	

}