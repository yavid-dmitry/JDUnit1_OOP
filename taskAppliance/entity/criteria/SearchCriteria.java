package by.htp.taskAppliance.entity.criteria;

public final class SearchCriteria {
	
	public static enum Oven{
		POWER, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
	}
	
	public static enum Notebook{
		BATTERY, OS, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
	}
	
	public static enum Refrigerator{
		POWER, WEIGHT, CLASS_POWER_CONSUMPTION, OVERALL_CAPACITY, HEIGHT, WIDTH
	}
	
	public static enum VacuumCleaner{
		POWER, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
	}
	
	public static enum TabletPC{
		BATTERY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR		
	}
	
	public static enum Speakers{
		POWER, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
	}
	
	private SearchCriteria() {}
}