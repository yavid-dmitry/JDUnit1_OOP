package by.htp.taskAppliance.service.validator;

import java.util.*;
import java.util.regex.Pattern;

import by.htp.taskAppliance.entity.criteria.*;
import by.htp.taskAppliance.entity.criteria.SearchCriteria.*;


public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {

		String categoria = criteria.getGroupSearchName();

		switch (categoria) {
		case "Laptop":
			return validateLaptop(criteria);
		case "Refrigerator":
			return validateRefrigerator(criteria);
		case "Oven":
			return validateOven(criteria);
		case "VacuumCleaner":
			return true;
		case "TabletPC":
			return true;
		case "Speakers":
			return true;
		default:
			return false;
		}
	}

	private static boolean validateLaptop(Criteria criteria) {

		Map<String, String> validation = new HashMap<>();
		validation.put(Laptop.BATTERY.toString(), "[0-9]+");
		validation.put(Laptop.CPU.toString(), "[0-9]\\.[0-9]");
		validation.put(Laptop.OS.toString(), "[0-9a-zA-Z]+");
		validation.put(Laptop.DISPLAY_INCHS.toString(), "[0-9]+");
		validation.put(Laptop.SYSTEM_MEMORY.toString(), "[0-9]+");

		Set<String> keys = criteria.getCriteria().keySet();

		for (String key : keys) {
			String regex = validation.get(key);
			String parametr = criteria.getCriteria().get(key);
			
			if (!Pattern.matches(regex, parametr)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean validateRefrigerator(Criteria criteria) {

		Map<String, String> validation = new HashMap<>();
		validation.put(Refrigerator.CLASS_POWER_CONSUMPTION.toString(), "[0-9]+");
		validation.put(Refrigerator.HEIGHT.toString(), "[0-9]+");
		validation.put(Refrigerator.OVERALL_CAPACITY.toString(), "[0-9]+");
		validation.put(Refrigerator.POWER.toString(), "[0-9]+");
		validation.put(Refrigerator.WEIGHT.toString(), "[0-9]+");
		validation.put(Refrigerator.WIDTH.toString(), "[0-9]+");
		Set<String> keys = criteria.getCriteria().keySet();

		for (String key : keys) {
			String regex = validation.get(key);
			String parametr = criteria.getCriteria().get(key);
			
			if (!Pattern.matches(regex, parametr)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean validateOven(Criteria criteria) {

		Map<String, String> validation = new HashMap<>();
		validation.put(Oven.CAPACITY.toString(), "[0-9][0-9]");
		validation.put(Oven.DEPTH.toString(), "[0-9]+");
		validation.put(Oven.HEIGHT.toString(), "[0-9]+");
		validation.put(Oven.POWER.toString(), "[0-9]+");
		validation.put(Oven.WEIGHT.toString(), "[0-9]+");
		validation.put(Oven.WIDTH.toString(), "[0-9]+");
		Set<String> keys = criteria.getCriteria().keySet();

		for (String key : keys) {
			String regex = validation.get(key);
			String parametr = criteria.getCriteria().get(key);
			
			if (!Pattern.matches(regex, parametr)) {
				return false;
			}
		}
		return true;
	}
	
	
}