package lesson05;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input two positive integers n and m:");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[][] myArray = new int[n][m];


		int k = 1;
		
		
		for(int t = 0; k < n*m; t++){
			for(int j = t; j < m-t; j++){
				myArray[t][j] = k;
				k++;
			}if(k>n*m) break;
			for(int i = t+1; i < n-t; i++){
				myArray[i][m-1-t]=k;
				k++;
			}if(k>n*m) break;
			for(int j = m-2-t; j >=t; j--){
				myArray[n-1-t][j] = k;
				k++;
			}if(k>n*m) break;
			for (int i = n-2-t; i >= 1+t; i--){
				myArray[i][t] = k;
				k++;
			}if(k>n*m) break;
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				System.out.print(myArray[i][j]+ "  ");
			}
			System.out.println();
		}
		


	}

}
