package br.model;

import java.util.Random;

public class CreateList {

	public static int[] createList(int size) {
		Random random = new Random();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(1000000); 
		}

		return arr;
	}

}
