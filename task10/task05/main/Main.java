package by.htp.task10.task05.main;
/*
 * Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки 
 * (объект, представляющий собой подарок). Составляющими целого подарка 
 * являются сладости и упаковка.
 */
import by.htp.task10.task05.Controller.Controller;

public class Main {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Controller controller = new Controller();
			
			String resp1 = controller.doAction("createGift gift=День Рождения");

			System.out.println(resp1);
			

		}
}