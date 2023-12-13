package edu.training.js.task_five;

public class Main {

	public static void main(String[] args) {

        double a = 1;
        double x1 = -2 * a;
        double dx = a / 5;
        int n = 10;

        double x = x1;
        double y;
        
        for(int i = 0; i < n; i++) {
        	if (x <= 0) {
        		 y = a / 2 * (Math.exp(x / a) + Math.exp(-x / a));
        	}else {
        		 y = 4 * Math.pow(a, 3) / (Math.pow(x, 2) + 4 * Math.pow(a, 2));
        	}
           
            System.out.println("Значение y для x = " + x + ": " + y);
            x += dx;
        }

	}

}
