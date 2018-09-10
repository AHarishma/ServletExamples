package com.full.stringcalculator;

public class StringCalculator {
	public static int add(String arg) {
		if (arg.length() == 0) {
			return 0;
		} else {
			String[] numbersArr = arg.split(",");
			if (numbersArr.length > 2)
				throw new IllegalArgumentException();
			int sum = 0;
			for (int i = 0; i < numbersArr.length; i++) {
				sum += Integer.parseInt(numbersArr[i]);
			}

			return sum;
		}
	}

	public static int add(String arg, boolean isDoubled) {
		if (arg.length() == 0) {
			return 0;
		} else {
			String[] numbersArr = arg.split(",");
			if (numbersArr.length > 2)
				throw new IllegalArgumentException();
			int sum = 0;
			for (int i = 0; i < numbersArr.length; i++) {
				if (isDoubled) {
					numbersArr[i] = String.valueOf(Integer.parseInt(numbersArr[i]) * 2);
				}
				sum += Integer.parseInt(numbersArr[i]);
			}

			return sum;
		}
	}
	


}
