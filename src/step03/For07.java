package step03;

import java.util.Scanner;

public class For07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int x, y;
		int[] sum = new int[input];
		
		for(int i=0 ; i<input ; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			sum[i] = x+y;
		}
		
		for(int i=0 ; i<input ; i++) {
			System.out.println("Case #"+(i+1)+": "+sum[i]);
		}
	}
}
