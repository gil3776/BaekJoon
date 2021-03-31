package step06;


public class Function02 {
	
	public static int d(int n) {
		int result = n;
		
		while(n != 0) {
			result += n%10;
			n = n/10;
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 10000;
		
		boolean[] check = new boolean[max+1];
		
		for(int i=1 ; i<=max ; i++) {
			int n = d(i);
			if(n <= max)	check[n] = true;
		}
		
		for(int i=1 ; i<=max ; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
	}
}
