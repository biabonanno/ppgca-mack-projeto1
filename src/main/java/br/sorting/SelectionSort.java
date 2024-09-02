package br.sorting;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Um a um, move o limite do subarray não ordenado
        for (int i = 0; i < n - 1; i++) {
            // Encontra o menor elemento no subarray não ordenado
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Troca o menor elemento encontrado com o primeiro elemento do subarray não ordenado
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
