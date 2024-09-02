package br.sorting;

public class MergeSort {

	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			// Encontra o ponto médio do array
			int mid = (left + right) / 2;

			// Ordena a primeira e a segunda metade
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			// Mescla as duas metades ordenadas
			merge(arr, left, mid, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		// Tamanhos dos subarrays a serem mesclados
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Arrays temporários para armazenar as duas metades
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copia os dados para os arrays temporários L[] e R[]
		for (int i = 0; i < n1; ++i) {
			L[i] = arr[left + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[mid + 1 + j];
		}

		// Mescla os arrays temporários de volta ao array original
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copia os elementos restantes de L[], se houver
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copia os elementos restantes de R[], se houver
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
