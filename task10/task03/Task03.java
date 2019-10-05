package by.htp.task10.task03;
/*
 * Задача 3.
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно 
 * хранить информацию о выходных и праздничных днях.
 */
public class Task03 {
	public static void main(String[] args) {
	Calendar calendar = new Calendar(DayOfWeek.TUESDAY);
	if(CalendarLogic.isDayOff(calendar, 9, 4)) {
		System.out.println("Выходной!!!!");
	}
	
	}
}
