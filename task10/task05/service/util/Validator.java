package by.htp.task10.task05.service.util;

import java.util.regex.*;

public class Validator {
	public static boolean validParameter(String name, int price) {

		Pattern pattern = Pattern.compile("[А-Я][а-я]{1,100}");
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches() && price > 0 && price < 30) {
			return true;
		}
		return false;
	}

}