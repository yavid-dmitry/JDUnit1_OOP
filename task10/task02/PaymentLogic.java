package by.htp.task10.task02;

public class PaymentLogic {
	public static int sumPayment(Payment payment) {
		 int sum = 0;
		 for(int i = 0; i < payment.getGoods().size(); i++) {
				sum += payment.getGoods().get(i).getCost();
			}

		 
		 return sum;
	}
	
	public static void addGood(Payment payment, String name, int cost, String description) {
		payment.getGoods().add(payment.new Good(name, cost, description));
	}
	
	
}
