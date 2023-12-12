package edu.training.js.task_four;

public class Main {

	public static void main(String[] args) {

		int count = 0;

		double[] x = {-2,0,2};
		double[] y = {-1,0,1};

		for (int i = 0; i < 3; i ++){
			if (x[i] > 0 && y[i] > 0){
			count++;
			}
		}

		System.out.println("Количество точек - " + count);
	}

}
