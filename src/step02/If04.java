package step02;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input_x = sc.nextInt();
		int input_y = sc.nextInt();
		
		if(input_x > 0) {
			if(input_y > 0) System.out.println("1");
			else System.out.println(("4"));
		}else{
			if(input_y > 0) System.out.println("2");
			else System.out.println(("3"));
		}
	}

}
