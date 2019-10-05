package by.htp.taskAppliance.dao.impl;

import java.io.*;
import java.util.*;

import by.htp.taskAppliance.dao.*;
import by.htp.taskAppliance.entity.*;
import by.htp.taskAppliance.entity.criteria.*;


public class ApplianceDAOImpl implements ApplianceDAO {

	final String INPUT = "appliances_db.txt";

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {

		List<Appliance> findAppliance = new ArrayList<Appliance>();

		String categoryOfGoods;
		categoryOfGoods = criteria.getGroupSearchName();

		Map<String, String> parametres;

		FileReader fileReader = null;

		try {
			fileReader = new FileReader(INPUT);
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(fileReader);
			while (reader.ready()) {

				String line = reader.readLine();

				if (categoryOfGoods.equals(line.split("\\s")[0])) {
					
					parametres = fillParametres(line);

					if (compareCriteria(parametres, criteria.getCriteria())) {
						findAppliance.add(ApplianceFactory.newAppliance(parametres));
					}
				}
			}
		} catch (IOException e) {
			throw new DAOException(e);
			
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					throw new DAOException(e);
				}
			}
		}
		return findAppliance;
	}

	private Map<String, String> fillParametres(String data) {

		Map<String, String> fillParametres = new HashMap<String, String>();
		String[] param = data.split("\\s?[,:;]?\\s+");

		fillParametres.put("NameGoods", param[0]);

		for (int i = 1; i < param.length; i++) {
			fillParametres.put(param[i].split("=")[0], param[i].split("=")[1]);
		}
		return fillParametres;
	}

	private boolean compareCriteria(Map<String, String> parametres, Map<String, String> criteria) {

		boolean isCopmare = true;
		Set<String> keys = criteria.keySet();
		for (String st : keys) {
			if (!criteria.get(st).equals(parametres.get(st))) {
				isCopmare = false;
			}
		}
		return isCopmare;
	}
}