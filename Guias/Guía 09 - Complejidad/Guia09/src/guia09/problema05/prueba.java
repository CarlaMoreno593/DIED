package guia09.problema05;

public class prueba {

	public static long f2(int a, int n){
		long b = 1;
		long c = a;
		for(int k = n; k > 0;){
			if(k%2 == 0) {
				k = k / 2;
				c = c * c;
			} else {
				k--;
				b = b * c;
			}
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		
		System.out.println(f2(2, 6));
		
	}
}
