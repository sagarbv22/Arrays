package com.iNeuron.ai;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 6, 3, 7, 2, 1, 4, 5 };
		
//		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {

				if (arr[j] < arr[j - 1]) {
					int tempVar = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tempVar;
				}

			}

		}

		for (int elem : arr) {
			System.out.print(elem + " ");
		}

	}

}
