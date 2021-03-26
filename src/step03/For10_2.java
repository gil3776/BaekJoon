package step03;

import java.util.Scanner;

public class For10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for(int i=0 ; i<input ; i++) {
			for(int x=input-1 ; x>=0 ; x--) {
				if(i<x) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
	}
}
