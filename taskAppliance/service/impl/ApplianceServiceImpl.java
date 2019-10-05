package by.htp.taskAppliance.service.impl;

import java.util.List;

import by.htp.taskAppliance.dao.*;
import by.htp.taskAppliance.entity.*;
import by.htp.taskAppliance.entity.criteria.*;
import by.htp.taskAppliance.service.*;
import by.htp.taskAppliance.service.validator.*;


public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {
		if (!Validator.criteriaValidator(criteria)) {
			throw new ServiceException("Ошибка");
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliance;

		try {
			appliance = applianceDAO.find(criteria);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		return appliance;
	}

}