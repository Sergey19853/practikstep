package edu.training.js.task_six;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		int a = 3 * 1000;
		int b = 6 * 10000;
        int m = 4;
        double t1 = Math.sqrt(a + b + m);
        double t2 = m * Math.sqrt(a + b);
        double t3 = Math.sqrt(a * b * m);
        double t4 = m * Math.sqrt(a * b);

        ArrayList<Integer> satisfyingValues = new ArrayList<>();
        int countOtherValues = 0;

        for (int k = -29; k <= 59; k++) {
            int f = (int) (Math.pow(k,3) - 25 * Math.pow(k,2) + 50 * k + 1000);
            if ((f >= t1 && f <= t2) || (f >= t3 && f <= t4)) {
                satisfyingValues.add(f);
            } else {
                countOtherValues++;
            }
        }

        System.out.println("Satisfying values: " + satisfyingValues);
        System.out.println("Count of other values: " + countOtherValues);

	}

}
