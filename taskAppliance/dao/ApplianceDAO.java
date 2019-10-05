package by.htp.taskAppliance.dao;

import java.util.List;

import by.htp.taskAppliance.entity.*;
import by.htp.taskAppliance.entity.criteria.*;


public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria) throws DAOException;
}