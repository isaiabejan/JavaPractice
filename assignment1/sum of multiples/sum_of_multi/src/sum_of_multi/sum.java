package sum_of_multi;
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner numb = new Scanner(System.in);
		int suma = 0;
		int nr = numb.nextInt();
		for(int i=1; i < nr; i++)
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
				suma+=i;
			}
		System.out.println(suma);
	}
}