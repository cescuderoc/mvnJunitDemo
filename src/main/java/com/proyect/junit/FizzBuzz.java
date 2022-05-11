package com.proyect.junit;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";

	public List<String> getNumbers(){
		List<String> numbers = new ArrayList<>();
		for (int i = 1 ; i <= 100; i++) {
			numbers.add(getNumber(i));
		}
		return numbers;
	}

	private String getNumber(int i) {
		if (isMultiple(i, 3) && isMultiple(i, 5)) {
			return FIZZ + BUZZ;				
		} 
		else if (isMultiple(i, 3)) {
			return FIZZ;				
		} 
		else if(isMultiple(i, 5)) {
			return BUZZ;
		} 
		return "" + i;
		
	}

	private boolean isMultiple(int i, int i2) {
		return i % i2 == 0;
	}

}
