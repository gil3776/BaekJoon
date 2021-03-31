package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array06 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n= Integer.parseInt(br.readLine());
		String[] input = new String[n];
		int[] cnt = new int[n];
		int point = 1;
		
		for(int i=0 ; i<n ; i++) {
			String[] x = br.readLine().split("");
			for(int j=0 ; j<x.length ; j++) {
				if(x[j].equals("o")) {
					cnt[i] += point;
					if(x[j+1]=="0" && j<x.length-1) {
						point++;
					}
				}else {
					point = 1;
				}
			}
			System.out.println(i);
			System.out.println(cnt[i]);
		}
		
		for(int i=0 ; i<n ; i++) {
			System.out.println(cnt[i]);
		}
	}

}
