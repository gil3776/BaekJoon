package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array04_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 42;
		int input_n = 10;
		int count=1;
		
		int[] input = new int[input_n];
		int[] x = new int[input_n];
		
		for(int i=0 ; i<input_n ; i++) {
			input[i] = Integer.parseInt(br.readLine());
			x[i] = input[i]%n;
		}
		
		for(int i=0 ; i<input_n-1 ; i++) {
			for(int j=i+1 ; j<input_n ; j++) {
				if(x[i] != x[j]) {
					if(j==input_n-1)	count++;
				}else	break; 
				
			}
		}
		
		System.out.println(count);
	}
}
