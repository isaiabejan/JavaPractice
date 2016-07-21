package fibonacci;

public class fibo {
	public static void main(String[] args) {
		int f[] = new int[1000];
		f[0] = 1; f[1] = 1;
		int i = 1,sum = 2;
		while(f[i] <= 10000) {
			i++;
			f[i] = f[i-2] + f[i-1];
			if (f[i] % 2 != 0) {
				System.out.println(f[i]);
				sum += f[i]; 
			}
		}
		System.out.print("Suma este: ");
		System.out.print(sum);
	}
}
