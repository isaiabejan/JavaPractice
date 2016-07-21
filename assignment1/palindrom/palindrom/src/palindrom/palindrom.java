package palindrom;

public class palindrom {
	public static boolean isPalindrome(int x) {
		int temp = x,x2=0;
		do {
			x2 += temp % 10;
			x2 = x2 * 10;
			temp = temp / 10;		
		} while (temp > 0);
		x2 = x2 / 10;
		if (x2 == x) return true;
		else return false;
	}
	
	public static void main(String [] args) {
		boolean ok = false;
		int i = 9999;
		while(!ok) {
			for(int j=9999; j > 0; j--) {
				int prod = i*j;
				if(isPalindrome(prod)) {
					System.out.printf("%d * %d = %d",i,j,prod);
					ok = true;
					break; 
					}
				}
			i--;
		}
	}	
}

