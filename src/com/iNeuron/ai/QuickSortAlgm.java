package com.iNeuron.ai;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortAlgm {

	// method to find the partition position
	static int partitionPosition(int arr[], int lo, int hi) {
		// choose the rightmost element as pivot
		int pivot = arr[hi];
		// pointer for greater element
		int i = (lo - 1);
		// traversing through all elements and comparing each element with pivot
		for (int j = lo; j < hi; j++) {
			// if element smaller than pivot is found, we swap it with the greater element
			// pointed by i
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// swapping the pivot element with the greater element specified by i
		int temp = arr[i + 1];
		arr[i + 1] = arr[hi];
		arr[hi] = temp;
		// returning the position from where partition is done
		return (i + 1);
	}

	static void quickSortInJava(int arr[], int lo, int hi) {
		if (lo < hi) {
			// finding pivot element
			int pi = partitionPosition(arr, lo, hi);
			// recursively calling on the left of the pivot
			quickSortInJava(arr, lo, pi - 1);
			// recursively calling on the right of the pivot
			quickSortInJava(arr, pi + 1, hi);
		}
	}

	public static void main(String[] args) {

		int[] data = { 5,8,1,8,9,4,3};
		int size = data.length;
		// calling quicksort on data
		quickSortInJava(data, 0, size - 1);
		System.out.println(Arrays.toString(data));

	}

}
