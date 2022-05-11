package com.proyect.junit;

public class Main {

	public static void main(String[] args) {
		double salary = 1000;

		FizzBuzz listarNumeros = new FizzBuzz();
		MoneyUtil saludar = new MoneyUtil();

		System.out.println(MoneyUtil.format(salary, "€"));
		System.out.println(saludar.saludo("peter"));
		System.out.println(listarNumeros.getNumbers());
	}

}
