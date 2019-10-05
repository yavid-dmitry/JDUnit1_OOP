package by.htp.task10.task01;
/*
 * Задача 1.
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Folder folder = new Folder("C://temp");
		TextFile file = new TextFile("example.txt", folder, "Мама мыла раму");
		FileLogic.appendData(file, " медленно и красиво");
		System.out.println(file);
	}

}
