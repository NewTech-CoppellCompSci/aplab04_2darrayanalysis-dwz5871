package lab;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

	
	//#1
	public static int[][] createRandom(int row, int column, int min, int max){ //add random numbers to arrays
		
		int[][] arr = new int[row][column];
		for (int i = 0; i < row ;i++) { // rows
			for (int j = 0; j < column ;j++) { // columns
				arr[i][j] = (int)(Math.random() * (max-min) + min);
			}
		}
		
		return arr;
	}
	
	
	//#2
	public static void printArray(int[][] arr)  { //prints the arrays
		for (int[] row: arr)
		{
			for (int item: row)
			{
				System.out.print(item + "  ");
			}
			System.out.println("");
		}
	}
	
	
	//#3
	public static int sumTotal(int[][] arr) { //adds all the ints in the arrays
		int total = 0;
		for (int[] row: arr)
		{
			for (int item: row)
			{
				total += item;
			}
		}
		return total;
	}
	
	
	
	//#4
	public static double average(int[][] arr) { //average all the ints in the arrays
		double average = 0;
		int numRows = arr.length;
		int numCols = arr[0].length;
		average = sumTotal(arr)/(double)(numRows * numCols);
		return average;
	}
	
	
	//#5
	public static int findMin(int[][] arr) { //finds the minimun int in array
		int total = 0;
		int min = 1000;
		for (int[] row: arr)
		{
			for (int item: row)
			{
				if (item < min) {
					min = item;
				}
			}
		}
		return min;
	}
	
	
	//#6
	public static int findMax(int[][] arr) { //finds the maximun int in array
		int total = 0;
		int max = 0;
		for (int[] row: arr)
		{
			for (int item: row)
			{
				if (item > max) {
					max = item;
				}
			}
		}
		return max;
	}
	
	
	//#7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2){ //finds diffrents in the 2 arrays of they have the same width and length
		int numRows1 = arr1.length;
		int numCols1 = arr1[0].length;
		int numRows2 = arr2.length;
		int numCols2 = arr2[0].length;
		if( numRows1 != numRows2 || numCols1 != numCols2) {
			return null;
		} else {
			int[][] diffArr = new int[numRows1][numCols1];	
			for (int i = 0; i < numRows1; i++) {
				for (int j = 0; j < numCols1; j++) {
					diffArr[i][j] = arr1[i][j] - arr2[i][j];
				}
			}
			return diffArr;			
		}		
	}
	
	public static int[][] shiftDown1(int[][] arr){ //shifts the arrays once
		int numRow = arr.length;
		int numCol = arr[0].length;
		
		int[][] shiftArr = new int[numRow][numCol];	
		for (int i = 0; i < numRow; i++) {
			for (int j = 0; j < numCol; j++) {
				int newI = i+1;
				if( newI == numRow )
					newI = 0;
				shiftArr[newI][j] = arr[i][j];
			}
		}
		return shiftArr;
	}
	
	//#8
	public static int[][] transposeRow(int[][] arr1, int dist){	//repeats the shift command dist amount of times	
		int[][] shifted = arr1;
		for( int i=0; i<dist; i++ ) {
			shifted = shiftDown1(shifted);
		}
		return shifted;
	}
	
	
	//#9
	public static int sum3D(int[][][] arr) { //adds all the ints in all of the arrays
		int total = 0;
		for(int[][] outer : arr ) {
			total += sumTotal(outer);
		}
		return total;
	}
	
	
	//#10
	public static double average3D(int[][][] arr) { //averages all the ints in all of the arrays
		int numX = arr.length;
		int numY = arr[0].length;
		int numZ = arr[0][0].length;
		return sum3D(arr) / (numX * numY * numZ);
	}
	
}
