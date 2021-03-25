package step02;

import java.util.Scanner;

public class If05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m = m-45;
		
		if(m >= 60) {
			m = m%60;
			h++;
		}else if(m < 0) {
			m = m + 60;
			h--;
		}
		
		if(h >= 24) {
			h = h%24;
		}else if(h < 0) {
			h = h+24;
		}
		
		
		System.out.println(h+" "+m);
		
	}
}
