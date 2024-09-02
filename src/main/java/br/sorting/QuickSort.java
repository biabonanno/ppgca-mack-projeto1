package br.sorting;

public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// Particiona o array em dois subarrays
			int pi = partition(arr, low, high);

			// Ordena recursivamente os subarrays
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // Escolhe o último elemento como pivô
		int i = (low - 1); // Índice do menor elemento

		for (int j = low; j < high; j++) {
			// Se o elemento atual é menor ou igual ao pivô
			if (arr[j] <= pivot) {
				i++;

				// Troca arr[i] e arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Troca arr[i+1] e arr[high] (ou o pivô)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
}
