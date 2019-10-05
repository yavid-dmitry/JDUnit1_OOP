package by.htp.task10.task02;

import java.util.ArrayList;

/*
 * Задача 2.
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно 
 * сформировать покупку из нескольких товаров.
 */
public class Payment {
	private ArrayList<Good> goods = new ArrayList<Payment.Good>();
	

	public Payment(String name, int cost, String description) {
		super();
		this.goods.add(new Good(name, cost, description));
	}


	public Payment(ArrayList<Good> goods) {
		super();
		this.goods = goods;
	}

	@Override
	public String toString() {
		String string = "";
		for(int i = 0; i < goods.size(); i++) {
			string += goods.get(i) +  "\n";
		}
		return string;
	}


	public ArrayList<Good> getGoods() {
		return goods;
	}


	public void setGoods(ArrayList<Good> goods) {
		this.goods = goods;
	}











	class Good {
		private String name;
		private int cost;
		private String Description;
		public Good(String name, int cost, String description) {
			super();
			this.name = name;
			this.cost = cost;
			Description = description;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		@Override
		public String toString() {
			return "Товар: " + name + ", цена: " + cost + ", Описание: " + Description;
		}
		
	}




















}
