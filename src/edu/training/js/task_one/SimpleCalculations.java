package edu.training.js.task_one;

public class SimpleCalculations {
	
	private double result;
	private double x;
	
	public SimpleCalculations() {

	}
	
	public SimpleCalculations(double x) {
		this.x = x;
	}

	public double getResult() {
		return result;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public void formulaCalculation() {
		
		result = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x ) / (x + (double) 2 / 3))) + 1.7;

	}
	


}
