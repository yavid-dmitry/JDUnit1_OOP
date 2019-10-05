package by.htp.task10.task03;

public enum DayOfWeek {
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	private int number;
	DayOfWeek(int number){
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	

}
