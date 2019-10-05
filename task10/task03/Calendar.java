package by.htp.task10.task03;

/*
 * Задача 3.
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно 
 * хранить информацию о выходных и праздничных днях.
 */
public class Calendar {
	private int[][] allDays;
	
	public Calendar(DayOfWeek firstYearDayIsThisDayOfWeek) {
		Month month = new Month();
		this.allDays = month.createMapOffDays(firstYearDayIsThisDayOfWeek);
	}

	class Month {
		private int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		private int[][] allDays = new int[12][];
		
		public Month() {
			for(int i = 0; i < daysInMonth.length; i++) {
				allDays[i] = new int[daysInMonth[i]];				
			}
		}
		private int[][] createMapOffDays(DayOfWeek firstYearDayIsThisDayOfWeek) {
			int count = firstYearDayIsThisDayOfWeek.getNumber();
			// Заполним дни года 0 - рабочий день, 1 - выходной;
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < daysInMonth[i]; j++) {
					switch (count) {
					case 6:
					case 7:
						this.allDays[i][j] = 1; count++;
						if(count == 8) {count = 1;}
					default:
						this.allDays[i][j] = 0; count++;
					}
				}
			}
		return this.allDays;
		}
	}

	public int[][] getAllDays() {
		return allDays;
	}

	
	void setAllDays(int[][] allDays) {
		this.allDays = allDays;
	}

}