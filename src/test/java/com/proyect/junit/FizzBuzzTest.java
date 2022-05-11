package com.proyect.junit;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private FizzBuzz game;

	@Before
	public void before() {
		game = new FizzBuzz();
	}

	@Test
	public void should_returnNumbers_whenNotAMultipleOf3Or5() {
//		FizzBuzz game = new FizzBuzz();
		List<String> numerList = game.getNumbers();
		Assert.assertEquals("1", numerList.get(0));
		Assert.assertEquals("2", numerList.get(1));
		Assert.assertEquals("7", numerList.get(6));
		Assert.assertEquals("13", numerList.get(12));
	}

	@Test
	public void should_returnFizz_whenAMultipleOf3() {
//		FizzBuzz game = new FizzBuzz();
		List<String> numerList = game.getNumbers();
		Assert.assertEquals(FIZZ, numerList.get(2));
		Assert.assertEquals(FIZZ, numerList.get(5));
		Assert.assertEquals(FIZZ, numerList.get(8));
		Assert.assertEquals(FIZZ, numerList.get(11));
	}

	@Test
	public void should_returnFizz_whenAMultipleOf5() {
//		FizzBuzz game = new FizzBuzz();
		List<String> numerList = game.getNumbers();
		Assert.assertEquals(BUZZ, numerList.get(4));
		Assert.assertEquals(BUZZ, numerList.get(9));
		Assert.assertEquals(BUZZ, numerList.get(19));
		Assert.assertEquals(BUZZ, numerList.get(24));
	}

	@Test
	public void should_returnFizzBuzz_whenAMultipleOf3And5() {
//		FizzBuzz game = new FizzBuzz();
		List<String> numerList = game.getNumbers();
		Assert.assertEquals(FIZZ + BUZZ, numerList.get(14));
		Assert.assertEquals(FIZZ + BUZZ, numerList.get(29));
		Assert.assertEquals(FIZZ + BUZZ, numerList.get(59));
		Assert.assertEquals(FIZZ + BUZZ, numerList.get(89));
	}
}
