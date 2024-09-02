package br.sorting;

public class BubbleSortOptimized {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Troca os elementos
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// Se não houve troca na iteração, o array já está ordenado
			if (!swapped) {
				break;
			}
		}
	}
}
