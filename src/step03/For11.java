package step03;

import java.util.Scanner;

public class For11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int x = sc.nextInt();
		
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<n ; i++) {
			if(a[i] < x)	System.out.print(a[i]+" ");
		}
	}
}
