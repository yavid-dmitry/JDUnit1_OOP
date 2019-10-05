package by.htp.task10.task04.dao.impl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import by.htp.task10.task04.bean.*;
import by.htp.task10.task04.dao.*;

public class TreasureFile implements TreasureDAO {

	@Override
	public List<Treasure> takeTreasure() throws DAOException {

		List<Treasure> cave = new ArrayList<Treasure>();

		try {
			FileReader fileReader = new FileReader("TreasureList.txt");
			BufferedReader reader = new BufferedReader(fileReader);

			while (reader.ready()) {
				String treasure = reader.readLine();
				String treasureName = treasure.split(",")[0];
				int treasureValue = Integer.parseInt(treasure.split(",")[0]);
				cave.add(new Treasure(treasureName, treasureValue));
			}
			fileReader.close();
			reader.close();

		} catch (IOException e) {
			throw new DAOException(e);
		} 

		return cave;
	}

}