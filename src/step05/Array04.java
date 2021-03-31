package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Array04 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 42;
		int input_n = 10;
		
		int[] input = new int[input_n];
		int[] x = new int[input_n];	//³ª¸ÓÁö
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		for(int i=0 ; i<input_n ; i++) {
			input[i] = Integer.parseInt(br.readLine());
			x[i] = input[i]%n;
		}
		
		count.add(x[0]); 
		for(int i =1 ; i<input_n ; i++) {
			for(int j=0 ; j<i ; j++) {
				if(count.get(j) == x[i]) {
					break;
				}
				if(j==i-1) count.add(x[i]);
			}
		}
		
		System.out.println(count.size());
		
		br.close();
		
	}

}
