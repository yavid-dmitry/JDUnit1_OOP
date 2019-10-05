package by.htp.task10.task04.main;

import java.util.List;

import by.htp.task10.task04.bean.Treasure;
import by.htp.task10.task04.service.ServiceException;
import by.htp.task10.task04.service.ServiceProvider;

/*
 * Задача 4.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 
100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ, 
выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
 */
public class Main {
	public static void main(String[] Args) {
		// TODO Auto-generated method stub		
		try {
			print(ServiceProvider.getInstance().getTreasureService().showTreasure());
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			print(ServiceProvider.getInstance().getTreasureService().getMaximumExpensiveTreasure());
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			print(ServiceProvider.getInstance().getTreasureService().getSumTreasure(1000));
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void print(Treasure treasure) {
		System.out.println(treasure.toString());
	}

	public static void print(List<Treasure> treasures) {
		for (Treasure t : treasures) {
			System.out.println(t.toString());
		}
	}
}
