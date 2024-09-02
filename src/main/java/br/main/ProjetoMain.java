package br.main;

import java.util.Date;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.model.CreateList;
import br.sorting.BubbleSort;
import br.sorting.BubbleSortOptimized;
import br.sorting.InsertionSort;
import br.sorting.MergeSort;
import br.sorting.QuickSort;
import br.sorting.SelectionSort;

public class ProjetoMain {

	private static final Logger LOGGER = LogManager.getLogger(ProjetoMain.class);

	public static void main(String[] args) {
		Date dataInicio;
		Date dataFim;
		LOGGER.log(Level.DEBUG, "Program has started");
		int[] firstVector = CreateList.createList(1000);
		int[] secondVector = CreateList.createList(10000);
		int[] thirdVector = CreateList.createList(100000);
		System.out.println("Vetores foram populados");
		int[] vectorToBeOrdered;

		// vetor com 1.000 elementos
		System.out.println("Inicializando ordenamento do vetor com 1.000 núemros");
		vectorToBeOrdered = copyVector(firstVector);
		dataInicio = new Date();
		System.out.println("BubbleSort com 1.000 elementos" + dataInicio.toString());
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do BubbleSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(firstVector);
		dataInicio = new Date();
		System.out.println("BubbleSortOtimizado com 1.000 elementos" + dataInicio.toString());
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out
				.println("Tempo do BubbleSortOtimizado em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(firstVector);
		dataInicio = new Date();
		System.out.println("InsertionSort com 1.000 elementos" + dataInicio.toString());
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do InsertionSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(firstVector);
		dataInicio = new Date();
		System.out.println("SelectionSort com 1.000 elementos" + dataInicio.toString());
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do SelectionSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(firstVector);
		dataInicio = new Date();
		System.out.println("MergeSort com 1.000 elementos" + dataInicio.toString());
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do MergeSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(firstVector);
		dataInicio = new Date();
		System.out.println("QuickSort com 1.000 elementos" + dataInicio.toString());
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do QuickSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		
		
		// vetor com 10.000 elementos
		System.out.println("Inicializando ordenamento do vetor com 10.000 núemros");
		vectorToBeOrdered = copyVector(secondVector);
		dataInicio = new Date();
		System.out.println("BubbleSort com 10.000 elementos" + dataInicio.toString());
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do BubbleSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(secondVector);
		dataInicio = new Date();
		System.out.println("BubbleSortOtimizado com 10.000 elementos" + dataInicio.toString());
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out
				.println("Tempo do BubbleSortOtimizado em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(secondVector);
		dataInicio = new Date();
		System.out.println("InsertionSort com 10.000 elementos" + dataInicio.toString());
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do InsertionSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(secondVector);
		dataInicio = new Date();
		System.out.println("SelectionSort com 10.000 elementos" + dataInicio.toString());
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do SelectionSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(secondVector);
		dataInicio = new Date();
		System.out.println("MergeSort com 10.000 elementos" + dataInicio.toString());
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do MergeSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(secondVector);
		dataInicio = new Date();
		System.out.println("QuickSort com 10.000 elementos" + dataInicio.toString());
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do QuickSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		// vetor com 100.000 elementos
		System.out.println("Inicializando ordenamento do vetor com 100.000 núemros");
		vectorToBeOrdered = copyVector(thirdVector);
		dataInicio = new Date();
		System.out.println("BubbleSort com 100.000 elementos" + dataInicio.toString());
		BubbleSort.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do BubbleSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(thirdVector);
		dataInicio = new Date();
		System.out.println("BubbleSortOtimizado com 100.000 elementos" + dataInicio.toString());
		BubbleSortOptimized.bubbleSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out
				.println("Tempo do BubbleSortOtimizado em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(thirdVector);
		dataInicio = new Date();
		System.out.println("InsertionSort com 100.000 elementos" + dataInicio.toString());
		InsertionSort.insertionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do InsertionSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(thirdVector);
		dataInicio = new Date();
		System.out.println("SelectionSort com 100.000 elementos" + dataInicio.toString());
		SelectionSort.selectionSort(vectorToBeOrdered);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do SelectionSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(thirdVector);
		dataInicio = new Date();
		System.out.println("MergeSort com 100.000 elementos" + dataInicio.toString());
		MergeSort.mergeSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do MergeSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));

		vectorToBeOrdered = copyVector(thirdVector);
		dataInicio = new Date();
		System.out.println("QuickSort com 100.000 elementos" + dataInicio.toString());
		QuickSort.quickSort(vectorToBeOrdered, 0, vectorToBeOrdered.length - 1);
		dataFim = new Date();
		System.out.println(dataFim);
		System.out.println("Tempo do QuickSort em milisegundos: " + (dataFim.getTime() - dataInicio.getTime()));
	}

	private static int[] copyVector(int[] vectorToBeCopied) {
		int[] vectorToBeReturned = new int[vectorToBeCopied.length];
		for (int i = 0; i < vectorToBeCopied.length; i++) {
			vectorToBeReturned[i] = vectorToBeCopied[i];
		}
		return vectorToBeReturned;
	}

}