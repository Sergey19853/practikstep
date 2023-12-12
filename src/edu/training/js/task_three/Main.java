package edu.training.js.task_three;

public class Main {

	public static void main(String[] args) {
		
		AccumulationAmounts accumulationAmounts = new AccumulationAmounts(0.5, 20);
		accumulationAmounts.calculateResult();
		System.out.println("Результат вычисления - " + accumulationAmounts.getResult());
		
	}

}
