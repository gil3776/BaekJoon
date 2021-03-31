package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array05 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int max=0;
		double ave, sum=0;
		
		double[] input = new double[n];
		String[] input_s = br.readLine().split(" ");
		
		for(int i=0 ; i<n ; i++) {
			input[i] = Integer.parseInt(input_s[i]);
			if(max < (int)input[i]) max= (int)input[i];
		}
		
		for(int i=0 ; i<n ; i++) {
			input[i] = input[i]/(double)max*100;
			sum += input[i];
		}
		
		ave = sum/(double)n;
		System.out.println(ave);
		
		br.close();
	}
}
