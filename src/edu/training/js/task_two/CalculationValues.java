package edu.training.js.task_two;

public class CalculationValues {

	private double result;
	private double x;
	private double a;
	private double b;
	private int n;
	
	public CalculationValues(double x, double a, double b, int n) {

		this.x = x;
		this.a = a;
		this.b = b;
		this.n = n;
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
		
	public void formulaCalculation() {
		
		double step;
		
		step = (getB() - getA()) / getN();
		
        for (int i = 1; i <= getN(); i++) {
        	
        	setX(getX() + step);
        	result = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin(Math.PI * x / (x + (double) 2 / 3))) + 1.7;
        	
        	String res = String.format("%.6f",result);
        	
            System.out.println("Порядковый номер - " + i + " значение аргумента - " + getX() + " результат - " + res);
            
        }       		
		
	}
	
}
