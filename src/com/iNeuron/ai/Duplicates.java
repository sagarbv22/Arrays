package com.iNeuron.ai;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] ar = new int[6];

		for (int k = 0; k < ar.length; k++) {
			System.out.println("Enter the value of " + k + " index");
			ar[k] = sc.nextInt();
		}

		System.out.println("Duplicates are :");

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] == ar[j]) {

					System.out.print(ar[j] + " ");

				}

			}
		}

	}

}
