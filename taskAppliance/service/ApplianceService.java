package by.htp.taskAppliance.service;

import java.util.List;

import by.htp.taskAppliance.entity.Appliance;
import by.htp.taskAppliance.entity.criteria.Criteria;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria) throws ServiceException;
	
}
