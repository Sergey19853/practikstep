package edu.training.js.task_eight;

public class Main {

	public static void main(String[] args) {

		double x = 0.1;
        double difference = 0.1;
        double limit = 10.0;

        System.out.println("  x   |   f(x)");
        System.out.println("--------------");

        while (x <= limit) {
        	
            double fx = Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;
            System.out.printf("%.2f  |  %.2f%n", x, fx);

            if (Math.abs(fx) < 1e-6){
                System.out.println("ноль функции");
                break;
            }
            x += difference;
            
        }

	}

}
