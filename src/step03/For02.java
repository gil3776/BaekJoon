package step03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int[] sum = new int[input];
		
		for(int i=0 ; i<input ; i++) {
			int input_a = sc.nextInt();
			int input_b = sc.nextInt();
			
			sum[i] = input_a+input_b;
		}
		
		for(int i=0 ; i<input ; i++) {
			System.out.println(sum[i]);
		}
	}
}
