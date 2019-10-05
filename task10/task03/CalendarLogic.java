package by.htp.task10.task03;

public class CalendarLogic {
	public static void setOneDay(Calendar calendar, int month, int day, int value) {
		int[][] temp = calendar.getAllDays();
		temp[month][day] = value;
		calendar.setAllDays(temp);
	}
	
	public static boolean isDayOff(Calendar calendar, int month, int day) {
		int[][]temp = calendar.getAllDays();
		if(temp[month][day] == 0) {
		return true; }
		else {
			return false;
		}
	}
}