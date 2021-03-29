package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;


public class While01 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> list = new ArrayList<Integer>();
		String input;
		int x=1, y=1;
		
		while(x!=0 && y!=0) {
			input = br.readLine();
			x = Integer.parseInt(input.split(" ")[0]);
			y = Integer.parseInt(input.split(" ")[1]);
			
			list.add(x+y);
		}
		for(int i=0 ; i<list.size()-1 ; i++) {
			bw.write(Integer.valueOf(list.get(i)) + " ");
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
