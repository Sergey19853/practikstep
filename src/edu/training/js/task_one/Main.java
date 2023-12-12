package edu.training.js.task_one;

public class Main {

	public static void main(String[] args) {
		
		SimpleCalculations calculation = new SimpleCalculations(0.5);
		calculation.formulaCalculation();
		System.out.println("Результат вычисления - " + calculation.getResult());
		
	}
	
}
