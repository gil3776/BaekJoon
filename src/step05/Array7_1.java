package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array7_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int c = Integer.parseInt(br.readLine());
		
		double[] result = new double[c];
				
		for(int i=0 ; i<c ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int[] input = new int[n];
			int sum=0, cnt=0;
			double ave;
			
			for(int j=0 ; st.hasMoreTokens() ; j++) {
				input[j]=Integer.parseInt(st.nextToken());
				sum += input[j];
			}
			ave = sum/n;
			
			for(int j=0 ; j<n ; j++) {
				if(input[j] > ave) {
					cnt++;
				}
			}
			result[i] = (double)cnt/n*100;
			
		}
		for(int i=0 ; i<c ; i++) {
			System.out.println(String.format("%.3f", result[i])+"%");
			
		}
	}

}
