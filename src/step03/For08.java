package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For08 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[][] x = new int[T][2];
		int[] sum = new int[T];
		
		for(int i=0 ; i<T ; i++) {
			String input = br.readLine().trim();
			x[i][0] = Integer.parseInt(input.split(" ")[0]);
			x[i][1] = Integer.parseInt(input.split(" ")[1]);
			sum[i] = x[i][0] + x[i][1];
		}
		
		for(int i=0 ; i<T ; i++) {
			bw.write("Case #" + (i+1) + ": " + x[i][0] + " + " + x[i][1] + " = " + sum[i]);
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
