package lab;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		ArrayAnalysis analysis = new ArrayAnalysis();
		
		int[][] arr1 = analysis.createRandom(6, 3, -2, 10);
		
		//#1 //prints array, total, average, min, and max
		int[][] arr2 = analysis.createRandom(10, 1, -2, 10);
		ArrayAnalysis.printArray(arr2);
		System.out.println("\nTotal:\n" + analysis.sumTotal(arr2));
		System.out.println("\nAverage:\n" + analysis.average(arr2));
		System.out.println("\nMinimum\n" + analysis.findMin(arr2));
		System.out.println("\nMaximum\n" + analysis.findMax(arr2));
		
		//#2 //prints null or differences and the shifted arrays the amount of time you input
		System.out.println("\nIf the length and width of the array lists are the same it will print the lists\nbut replace the numbers with a driffrent if they arn't then it will print null:\n" + analysis.diffArrays(arr1, arr2));
		Scanner inKey = new Scanner(System.in);
		System.out.println("\nHow many times should the arrays shift?");
		int dist = inKey.nextInt();
		System.out.println("\nShifted Array\n");
		analysis.printArray(analysis.transposeRow(arr2, dist));
		
		//#3 //makes a 3D array list and prints it
		int[][][] arr3D = new int[3][4][5];
		for (int i = 0; i < arr3D.length; i++) {
			arr3D[i] = analysis.createRandom(4, 5, -40, 40);
		}
		int x = 1;
		for (int[][] arr : arr3D) {
			System.out.println("\nLayer #" + x);
			analysis.printArray(arr);
			x++;
		}

		//#4 //prints total and average values of the 3D arrays
		System.out.println("\nTotal Value\n" + analysis.sum3D(arr3D));
		System.out.println("\nAverage Value\n" + analysis.average3D(arr3D));
		
	}
	
	
	
	
	
	
	
}
