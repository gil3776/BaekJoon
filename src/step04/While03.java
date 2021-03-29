package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class While03 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int count = 0;
		int end = 0;
		
		int input_p = input;
		while( true ) {
			int a = input_p%10;
			int b = (input_p/10 + input_p%10)%10;
			
			end = a*10 + b;
			count ++;
			
			if(input == end) {
				break;
			}else {
				input_p = end;
			}
		}
		bw.write(count+" ");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
