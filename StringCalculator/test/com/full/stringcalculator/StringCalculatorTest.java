package com.full.stringcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	// Requirement 1 : Method take 0, 1 or 2 arguments
	@Test
	public void testThatMethodCanTakeTwoNumbers() {
		StringCalculator.add("2,3");
	}

	@Test
	public void testThatMethodCanTakeOneNumbers() {
		StringCalculator.add("2");
	}

	@Test
	public void testThatMethodCanTakeNumbers() {
		StringCalculator.add("");
	}

	// Requirement 2 : Method that take empty string as argument and returns 0
	@Test
	public void testForEmptyStringMethodReturnsZero() {
		int actual = StringCalculator.add("");
		Assertions.assertEquals(0, actual);
	}

	// Requirement 3 : Method that does not allow more than two arguments
	@Test
	public void testCannotTakeMoreThanTwoArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("2,3,4"));
	}

	// Requirement 4 : Method that return sum of numbers
	@Test
	public void testThatMethodWillReturnSumOfTwoNumbers() {
		int actual = StringCalculator.add("10,13");
		Assertions.assertEquals(23, actual);
	}

	@Test
	public void testThatMethodWillReturnSumOfSingleNumber() {
		int actual = StringCalculator.add("2");
		Assertions.assertEquals(2, actual);
	}

	@Test
	public void testThatMethodWillTakeOtherTwoNumbers() {
		int actual = StringCalculator.add("5,4");
		Assertions.assertEquals(9, actual);
	}

	// Requirement 5 : Allow passing in an optional boolean value TRUE, which
	// doubles all the numbers before summing them.

	@Test
	public void testThatMethodTakesTwoNumbersAndTrue() {
		int actual = StringCalculator.add("10,13", true);
		Assertions.assertEquals(46, actual);
	}

	@Test
	public void testThatMethodTakesOneNumberAndTrue() {
		int actual = StringCalculator.add("2", true);
		Assertions.assertEquals(4, actual);
	}

	@Test
	public void testThatMethodCanTakeOtherTwoNumbersAndTrue() {
		int actual = StringCalculator.add("5,4", true);
		Assertions.assertEquals(18, actual);
	}

	@Test
	public void testThatMethodCanTakeOtherTwoNumbersAndFalse() {
		int actual = StringCalculator.add("5,4", false);
		Assertions.assertEquals(9, actual);
	}

	@Test
	public void testThatMethodCanEmptyStringAndTrue() {
		int actual = StringCalculator.add("", true);
		Assertions.assertEquals(0, actual);
	}

	@Test
	public void testThatMethodCanEmptyStringAndFalse() {
		int actual = StringCalculator.add("", false);
		Assertions.assertEquals(0, actual);
	}
}
