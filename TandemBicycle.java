import java.util.Scanner;
public class TandemBicycle {
	public static void BubbleSort(int []arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static int findingMax(int a, int b) {
		if(a > b) return a;
		return b;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int qNumber = input.nextInt();
		int nPair = input.nextInt();
		int sum = 0;
		int [] dArr = new int[nPair];
		int [] pArr = new int[nPair];
		for(int i = 0; i < nPair; i++) {
			dArr[i] = input.nextInt();
		}
		for(int i = 0; i < nPair; i++) {
			pArr[i] = input.nextInt();
	}
		BubbleSort(dArr);
		BubbleSort(pArr);
		//Based on the Question number
		//use the array to tally up the speeds 
		//You might need to consider writing a small helper
		//function to find the max of two given integers.
		if(qNumber == 1) {
			//go through the array (you only need one for loop)
			//pair up all the max values max values
			//use the max function to find the max
			//add them together
			for(int z = dArr.length-1; z >= 0; z--) {
				sum += findingMax(dArr[z],pArr[z]);
			}
		}
		else {
			//go through the array (you only need one for loop)
			//pair up all the max values max values
			//use the max function to find the max
			//add them together
			for(int i = 0; i < dArr.length; i++) {
				sum += findingMax(dArr[i],pArr[pArr.length-i-1]);
			}
		}
		//print the tally
		System.out.println(sum);
}
}