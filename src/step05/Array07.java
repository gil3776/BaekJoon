package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array07 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());
		
		double[] result = new double[c];
		double ave;
		
		for(int i=0 ; i<c ; i++) {
			String[] input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int sum = 0;
			int cnt = 0;
			
			for(int j=1 ; j<=n ; j++) {
				sum += Integer.parseInt(input[j]);
				
			}
			
			ave = sum/n;
			
			for(int j=1 ; j<=n ; j++) {
				if(Integer.parseInt(input[j]) > ave)
					cnt++;
			}
			
			result[i] = (double)cnt/n*100;
		}
		
		for(int i=0 ; i<c ; i++) {
			System.out.println(String.format("%.3f", result[i])+"%");
		}
		
		br.close();
	}

}
