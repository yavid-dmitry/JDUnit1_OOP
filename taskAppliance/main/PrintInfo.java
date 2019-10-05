package by.htp.taskAppliance.main;

import java.util.List;

import by.htp.taskAppliance.entity.Appliance;

public class PrintInfo {
		
		public static void print(List<Appliance> appliances) {
				
				if (appliances.isEmpty()) {
					System.out.println("Совпадений не обнаружено");
					
				} else {
					for (Appliance appliance : appliances) {
						System.out.println(appliance.toString());
					}
				}
			}
		}