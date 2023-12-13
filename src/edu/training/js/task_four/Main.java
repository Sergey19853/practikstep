package edu.training.js.task_four;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int n = 5;

		int [] masX = new int[n];
		int [] masY = new int[n];

		fillArray(masX);
		fillArray(masY);

		for (int i = 0; i < masX.length; i++) {
			System.out.print("[" + masX[i] + "]");
		}
		System.out.println();

		for (int i = 0; i < masY.length; i++) {
			System.out.print("[" + masY[i] + "]");
		}
		System.out.println();

		System.out.println("Количество точек: " + countPoints(masX, masY));

	}

	public static void fillArray(int[] mas) {

		Random random = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = 2 - random.nextInt(5);
		}

	}

	public static int countPoints(int [] mas1, int [] mas2) {
		int count = 0;

		for (int i = 0; i < mas1.length; i++) {
			if (((mas1[i] >= -2 && mas1[i] <= 0) && (mas2[i] >= 0 && mas2[i] <= 2)) || ((mas1[i] >= 0 && mas1[i] <= 2) && (mas2[i] >= -1 && mas2[i] <= 1))) {
				count++;
			}
		}

		return count;
	}

}


