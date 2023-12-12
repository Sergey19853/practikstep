package edu.training.js.task_three;

public class AccumulationAmounts {
	
	private double x;
	private int n;
	private double result;
	
	public void setX(double x) {

		this.x = x;
	}
	
	public void setN(int n) {

		this.n = n;
	}
	
	public double getResult() {

		return result;
	}
	
	public AccumulationAmounts(double x, int n) {
		this.x = x;
		this.n = n;
	}
	
	public void calculateResult () {
		
		double sum = 0;
		int k = 1;
		int i;
		
		for(i = k; i <= n; i ++) {
			sum = sum + (Math.sin(i*x/2) + Math.sin((i*x-1)/2)) / Math.pow(Math.E, (x-1)/i);
		}
		
		result = Math.sqrt(n*Math.PI) * sum;
		
	}

}
