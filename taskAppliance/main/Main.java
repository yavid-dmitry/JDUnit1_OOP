package by.htp.taskAppliance.main;

import java.util.*;

import by.htp.taskAppliance.entity.*;
import by.htp.taskAppliance.entity.criteria.*;
import by.htp.taskAppliance.entity.criteria.SearchCriteria.Oven;
import by.htp.taskAppliance.entity.criteria.SearchCriteria.Speakers;
import by.htp.taskAppliance.service.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Appliance> appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		Criteria criteriaSpeakers = new Criteria(Speakers.class.getSimpleName());
		criteriaSpeakers.add(Speakers.CORD_LENGTH.toString(), "1000");

		try {
			appliance = service.find(criteriaSpeakers);
			PrintInfo.print(appliance);
		} catch (ServiceException e) {
			System.out.println(e.getMessage());

		}

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 100);
		criteriaOven.add(Oven.POWER.toString(), 90);

		try {
			appliance = service.find(criteriaOven);
			PrintInfo.print(appliance);
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		}

	}

}