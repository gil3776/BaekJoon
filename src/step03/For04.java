package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For04 {
	
	public static void main(String[] args) throws IOException{
		
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int T = Integer.parseInt(bf.readLine());
			int[][] input_ab = new int[T][2];
			
			for(int i=0 ; i<T ; i++) {
				String input_s = bf.readLine().trim();
				input_ab[i][0] = Integer.parseInt(input_s.split(" ")[0]);
				input_ab[i][1] = Integer.parseInt(input_s.split(" ")[1]);
			}
			
			for(int i=0 ; i<T ; i++) {
				int sum = input_ab[i][0] + input_ab[i][1];
				bw.write(sum+" ");
				bw.newLine();
			}
			
			bf.close();
			bw.flush();
			bw.close();
	}
}
