package edu.training.js.task_seven;

public class Main {

	public static void main(String[] args) {

		int n = 10; // количество значений x
		int m = 5;  // количество значений z
		double c = 1.0; // начальное значение x
		double zc = 0.5; // начальное значение z
		double hx = 0.5; // шаг для x
		double hz = 0.1; // шаг для z

		for (int i = 0; i < n; i++) {
		    double x = c + i * hx; // вычисляем текущее значение x
		    for (int j = 0; j < m; j++) {
		        double z = zc + j * hz; // вычисляем текущее значение z
		        double result = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log(z) + (Math.abs(Math.log(z) / Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2)));
		        System.out.println("Значение функции для x = " + x + " и z = " + z + ": " + result);
		    }
		}

	}

}
