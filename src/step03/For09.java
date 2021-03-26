package step03;

import java.util.Scanner;

public class For09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input ; i++) {
			for(int y=0 ; y<i ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
