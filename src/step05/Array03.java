package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array03 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 3;
		int[] a = new int[n];
		int[] count = new int[10];
		double mul=1;
		
		for(int i=0 ; i<n ; i++) { 
			a[i] = Integer.parseInt(br.readLine());
			
			mul *= a[i];
		}
		
		String[] array = String.format("%.0f", mul).split("");		
		
		for(String i: array) {
			count[Integer.parseInt(i)]++;
		}
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println(count[i]);
		}
	}

}
