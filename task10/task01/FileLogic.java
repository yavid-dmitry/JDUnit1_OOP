package by.htp.task10.task01;
/*
 * Задача 1.
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class FileLogic {
	public static TextFile createTextFile(String name, Folder folder, String data) {
		return new TextFile(name, folder, data);
	}
	
	public static void changeName (File file,String newName) {
		file.setName(newName);
	}
	
	public static void appendData(TextFile file, String newData) {
		String data = file.getData();
		data += newData;
		file.setData(data);
	}
	
	public static void eraseData(TextFile file) {
		file.setData("");
	}
}
