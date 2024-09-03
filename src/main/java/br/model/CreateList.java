package br.model;

import java.util.Random;

public class CreateList {

	public static int[] createRandomList(int size) {
		Random random = new Random();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(1000000); 
		}

		return arr;
	}

	public static int[] createCrescente(int size) {
		int [] vector = new int [size];
		for(int i =0; i < size; i++) {
			vector [i] = (i+1);
 		}
		return vector;
	}

	
	public static int[] createDecrescente(int size) {
		int [] vector = new int [size];
		int tamanho = size;
		for(int i =0; i < size; i++) {
			tamanho--;
			vector [i] = tamanho -1;
 		}
		return vector;
	}
}
