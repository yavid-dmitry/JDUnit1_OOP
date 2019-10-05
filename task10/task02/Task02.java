package by.htp.task10.task02;
/*
 * Задача 2.
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно 
 * сформировать покупку из нескольких товаров.
 */
public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p = new Payment("Ключ",123,"Ключ от квартиры, где деньги лежат");
		PaymentLogic.addGood(p, "Уши", 789, "От мертвого осла уши");
		System.out.println(p);
	}

}
