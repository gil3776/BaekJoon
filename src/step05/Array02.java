package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Array02 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 9;
		int[] array = new int[n];
		int max=0;
		int max_index=0;
		
		for(int i=0 ; i<n ; i++) {
			array[i] = Integer.parseInt(br.readLine());
			
			if(max < array[i]) {
				max=array[i];
				max_index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(max_index);
	}
}
