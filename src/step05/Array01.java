package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Array01 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int i = 0;
		
		while(st.hasMoreTokens()) {
			array[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		int max= array[0], min=array[0];
		
		
		for(i=0 ; i< n ; i++) {
			if(max < array[i]) max=array[i];
			if(min > array[i]) min=array[i];
		}
		
		
		bw.write(min+" "+max);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
