package by.htp.taskAppliance.dao.impl;

import java.util.*;

import by.htp.taskAppliance.dao.*;
import by.htp.taskAppliance.entity.*;
import by.htp.taskAppliance.entity.criteria.*;

class ApplianceFactory {

	static Appliance newAppliance(Map<String, String> parameters) throws DAOException {

		Appliance toReturn = null;
		String categoryOfGoods = parameters.get("NameGoods");

		switch (categoryOfGoods) {

		case "Laptop":
			toReturn = createLaptop(parameters);
			break;

		case "Oven":
			toReturn = createOven(parameters);
			break;

		case "Refrigerator":
			toReturn = createRefrigerator(parameters);
			break;

		case "Speakers":
			toReturn = createSpeakers(parameters);
			break;

		case "TabletPC":
			toReturn = createTabletPC(parameters);
			break;

		case "VacuumCleaner":
			toReturn = createVacuumCleaner(parameters);
			break;

		default:
			throw new DAOException("Тип прибора не найден");
		}
		return toReturn;
	}

	private static Laptop createLaptop(Map<String, String> parameters) {

		Laptop laptop;
		
		String categoryOfGoods = parameters.get("NameGoods");
		int batteryCapacity = Integer.parseInt(parameters.get(SearchCriteria.Laptop.BATTERY.toString()));
		String os = parameters.get(SearchCriteria.Laptop.OS.toString());
		int systemMemory = Integer.parseInt(parameters.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()));
		double cpu = Double.parseDouble(parameters.get(SearchCriteria.Laptop.CPU.toString()));
		int displayInchs = Integer.parseInt(parameters.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString()));

		laptop = new Laptop(categoryOfGoods, batteryCapacity, os, systemMemory, cpu, displayInchs);
		return laptop;
	}

	private static Oven createOven(Map<String, String> parametres) {

		Oven oven;

		String categoryOfGoods = parametres.get("NameGoods");
		int powerConsumption = Integer.parseInt(parametres.get(SearchCriteria.Oven.POWER.toString()));
		int weight = Integer.parseInt(parametres.get(SearchCriteria.Oven.WEIGHT.toString()));
		int capacity = Integer.parseInt(parametres.get(SearchCriteria.Oven.CAPACITY.toString()));
		int depth = Integer.parseInt(parametres.get(SearchCriteria.Oven.DEPTH.toString()));
		int height = Integer.parseInt(parametres.get(SearchCriteria.Oven.HEIGHT.toString()));
		int width = Integer.parseInt(parametres.get(SearchCriteria.Oven.WIDTH.toString()));

		oven = new Oven(categoryOfGoods, powerConsumption, weight, capacity, depth, height, width);

		return oven;
	}

	private static Refrigerator createRefrigerator(Map<String, String> parametres) {

		Refrigerator refrigerator;

		String categoryOfGoods = parametres.get("NameGoods");
		int powerConsumption = Integer
				.parseInt(parametres.get(SearchCriteria.Refrigerator.POWER.toString()));
		int weight = Integer.parseInt(parametres.get(SearchCriteria.Refrigerator.WEIGHT.toString()));
		int classPowerConsumption = Integer.parseInt(parametres.get(SearchCriteria.Refrigerator.CLASS_POWER_CONSUMPTION.toString()));
		int overallCapacity = Integer.parseInt(parametres.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()));
		int height = Integer.parseInt(parametres.get(SearchCriteria.Refrigerator.HEIGHT.toString()));
		int width = Integer.parseInt(parametres.get(SearchCriteria.Refrigerator.WIDTH.toString()));

		refrigerator = new Refrigerator(categoryOfGoods, powerConsumption, weight, classPowerConsumption, overallCapacity,
				height, width);

		return refrigerator;
	}

	private static Speakers createSpeakers(Map<String, String> parametres) {

		Speakers speakers;

		String categoryOfGoods = parametres.get("NameGoods");
		int powerConsumption = Integer.parseInt(parametres.get(SearchCriteria.Speakers.POWER.toString()));
		int numberOfSpeakers = Integer.parseInt(parametres.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()));
		String frequencyRange = parametres.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString());
		int cordLength = Integer.parseInt(parametres.get(SearchCriteria.Speakers.CORD_LENGTH.toString()));

		speakers = new Speakers(categoryOfGoods, powerConsumption, numberOfSpeakers, frequencyRange, cordLength);

		return speakers;
	}

	private static TabletPC createTabletPC(Map<String, String> parametres) {

		TabletPC tabletPC;

		String categoryOfGoods = parametres.get("NameGoods");
		int batteryCapacity = Integer.parseInt(parametres.get(SearchCriteria.TabletPC.BATTERY.toString()));
		int displayInches = Integer.parseInt(parametres.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()));
		int memoryRom = Integer.parseInt(parametres.get(SearchCriteria.TabletPC.MEMORY_ROM.toString()));
		int flashMemoryCapasity = Integer.parseInt(parametres.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()));
		String color = parametres.get(SearchCriteria.TabletPC.COLOR.toString());

		tabletPC = new TabletPC(categoryOfGoods, batteryCapacity, displayInches, memoryRom, flashMemoryCapasity, color);

		return tabletPC;
	}

	private static VacuumCleaner createVacuumCleaner(Map<String, String> parametres) {

		VacuumCleaner vacuumCleaner;

		String categoryOfGoods = parametres.get("NameGoods");
		int powerConsumption = Integer
				.parseInt(parametres.get(SearchCriteria.VacuumCleaner.POWER.toString()));
		String filterType = parametres.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString());
		String bagType = parametres.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString());
		String wandType = parametres.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString());
		int motorSpeeadRegulation = Integer.parseInt(parametres.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()));
		int cleaningWidth = Integer.parseInt(parametres.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()));

		vacuumCleaner = new VacuumCleaner(categoryOfGoods, powerConsumption, filterType, bagType, wandType,
				motorSpeeadRegulation, cleaningWidth);

		return vacuumCleaner;
	}

}