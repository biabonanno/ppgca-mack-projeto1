package br.main;

import java.util.Date;

import br.model.CreateList;
import br.sorting.BubbleSort;
import br.sorting.BubbleSortOptimized;
import br.sorting.InsertionSort;
import br.sorting.MergeSort;
import br.sorting.QuickSort;
import br.sorting.SelectionSort;

public class ProjetoMain {

	public static void main(String[] args) {
		Date dataInicio;
		Date dataFim;
		int[] firstVectorRandom = CreateList.createRandomList(1000);
		int[] secondVectorRandom = CreateList.createRandomList(10000);
		int[] thirdVectorRandom = CreateList.createRandomList(100000);
		
		int[] firstVectorCrescente = CreateList.createCrescente(1000);
		int[] secondVectorCrescente = CreateList.createCrescente(10000);
		int[] thirdVectorCrescente = CreateList.createCrescente(100000);
		
		int[] firstVectorDecrescente = CreateList.createDecrescente(1000);
		int[] secondVectorDecrescente = CreateList.createDecrescente(10000);
		int[] thirdVectorDecrescente = CreateList.createDecrescente(100000);
		
		int[] vectorToBeOrdered;

		// vetor com 1.000 elementos
		System.out.println("Inicializando ordenação dos vetores com 1.000 números");
		System.out.println();
		
		//bubblesort com 1000 elementos
		vectorToBeOrdered = copyVector(firstVectorRandom);
		dataInicio = new Date();
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort com 1.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(firstVectorCrescente);
		dataInicio = new Date();
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort com 1.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(firstVectorDecrescente);
		dataInicio = new Date();
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort com 1.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//bubblesort otimizado com 1000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(firstVectorRandom);
		dataInicio = new Date();
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort otimizado com 1.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(firstVectorCrescente);
		dataInicio = new Date();
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort otimizado com 1.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(firstVectorDecrescente);
		dataInicio = new Date();
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort otimizado com 1.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//insertion sort com 1000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(firstVectorRandom);
		dataInicio = new Date();
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("InsertionSort com 1.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(firstVectorCrescente);
		dataInicio = new Date();
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("InsertionSort com 1.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(firstVectorDecrescente);
		dataInicio = new Date();
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("InsertionSort com 1.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//SelectionSort com 1000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(firstVectorRandom);
		dataInicio = new Date();
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("SelectionSort com 1.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		vectorToBeOrdered = copyVector(firstVectorCrescente);
		dataInicio = new Date();
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("SelectionSort com 1.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(firstVectorDecrescente);
		dataInicio = new Date();
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("SelectionSort com 1.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//MergeSort com 1000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(firstVectorRandom);
		dataInicio = new Date();
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("MergeSort com 1.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		vectorToBeOrdered = copyVector(firstVectorCrescente);
		dataInicio = new Date();
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("MergeSort com 1.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(firstVectorDecrescente);
		dataInicio = new Date();
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("MergeSort com 1.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//QuickSort com 1000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(firstVectorRandom);
		dataInicio = new Date();
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("QuickSort com 1.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		vectorToBeOrdered = copyVector(firstVectorCrescente);
		dataInicio = new Date();
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("QuickSort com 1.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(firstVectorDecrescente);
		dataInicio = new Date();
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("QuickSort com 1.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		System.out.println("---------------------------------------------------------------");
		
		
		
		// vetor com 10.000 elementos
		System.out.println("Inicializando ordenação dos vetores com 10.000 números");
		System.out.println();
		
		//bubblesort com 10.000 elementos
		vectorToBeOrdered = copyVector(secondVectorRandom);
		dataInicio = new Date();
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort com 10.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(secondVectorCrescente);
		dataInicio = new Date();
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort com 10.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(secondVectorDecrescente);
		dataInicio = new Date();
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort com 10.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//bubblesort otimizado com 10.000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(secondVectorRandom);
		dataInicio = new Date();
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort otimizado com 10.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(secondVectorCrescente);
		dataInicio = new Date();
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort otimizado com 10.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(secondVectorDecrescente);
		dataInicio = new Date();
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort otimizado com 10.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//insertion sort com 10.000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(secondVectorRandom);
		dataInicio = new Date();
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("InsertionSort com 10.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(secondVectorCrescente);
		dataInicio = new Date();
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("InsertionSort com 10.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(secondVectorDecrescente);
		dataInicio = new Date();
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("InsertionSort com 10.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//SelectionSort com 10.000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(secondVectorRandom);
		dataInicio = new Date();
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("SelectionSort com 10.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		vectorToBeOrdered = copyVector(secondVectorCrescente);
		dataInicio = new Date();
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("SelectionSort com 10.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(secondVectorDecrescente);
		dataInicio = new Date();
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("SelectionSort com 10.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//MergeSort com 10.000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(secondVectorRandom);
		dataInicio = new Date();
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("MergeSort com 10.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		vectorToBeOrdered = copyVector(secondVectorCrescente);
		dataInicio = new Date();
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("MergeSort com 10.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(secondVectorDecrescente);
		dataInicio = new Date();
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("MergeSort com 10.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//QuickSort com 10.000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(secondVectorRandom);
		dataInicio = new Date();
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("QuickSort com 10.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		vectorToBeOrdered = copyVector(secondVectorCrescente);
		dataInicio = new Date();
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("QuickSort com 10.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(secondVectorDecrescente);
		dataInicio = new Date();
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("QuickSort com 10.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		System.out.println("---------------------------------------------------------------");
		
		// vetor com 100.000 elementos
		System.out.println("Inicializando ordenação dos vetores com 100.000 números");
		System.out.println();
		
		//bubblesort com 10.000 elementos
		vectorToBeOrdered = copyVector(thirdVectorRandom);
		dataInicio = new Date();
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort com 100.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(thirdVectorCrescente);
		dataInicio = new Date();
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort com 100.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(thirdVectorDecrescente);
		dataInicio = new Date();
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort com 100.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//bubblesort otimizado com 100.000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(thirdVectorRandom);
		dataInicio = new Date();
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort otimizado com 100.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(thirdVectorCrescente);
		dataInicio = new Date();
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort otimizado com 100.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(thirdVectorDecrescente);
		dataInicio = new Date();
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("Bubblesort otimizado com 100.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//insertion sort com 100.000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(thirdVectorRandom);
		dataInicio = new Date();
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("InsertionSort com 100.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(thirdVectorCrescente);
		dataInicio = new Date();
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("InsertionSort com 100.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(thirdVectorDecrescente);
		dataInicio = new Date();
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("InsertionSort com 100.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//SelectionSort com 100.000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(thirdVectorRandom);
		dataInicio = new Date();
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("SelectionSort com 100.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		vectorToBeOrdered = copyVector(thirdVectorCrescente);
		dataInicio = new Date();
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("SelectionSort com 100.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(thirdVectorDecrescente);
		dataInicio = new Date();
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println("SelectionSort com 100.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		//MergeSort com 100.000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(thirdVectorRandom);
		dataInicio = new Date();
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("MergeSort com 100.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		vectorToBeOrdered = copyVector(thirdVectorCrescente);
		dataInicio = new Date();
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("MergeSort com 100.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(thirdVectorDecrescente);
		dataInicio = new Date();
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("MergeSort com 100.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		//QuickSort com 100.000 elementos
		System.out.println();
		vectorToBeOrdered = copyVector(thirdVectorRandom);
		dataInicio = new Date();
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("QuickSort com 100.000 elementos randomicos em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		vectorToBeOrdered = copyVector(thirdVectorCrescente);
		dataInicio = new Date();
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("QuickSort com 100.000 elementos crescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		
		vectorToBeOrdered = copyVector(thirdVectorDecrescente);
		dataInicio = new Date();
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println("QuickSort com 100.000 elementos decrescentes em milissegundos: " + (dataFim.getTime() - dataInicio.getTime()));
		
		System.out.println("---------------------------------------------------------------");

	}

	private static int[] copyVector(int[] vectorToBeCopied) {
		int[] vectorToBeReturned = new int[vectorToBeCopied.length];
		for (int i = 0; i < vectorToBeCopied.length; i++) {
			vectorToBeReturned[i] = vectorToBeCopied[i];
		}
		return vectorToBeReturned;
	}

}