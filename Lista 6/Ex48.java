import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, c = 0, t = 0;

		System.out.print("Insira a quantidade de termos: ");
		int n = sc.nextInt();

		int k = 1;
		for (i = 2; k <= n; i++) {
			c = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.print(i + ", ");
				k++;
			}
		}
	}
}

//Gabriel Antonio Santos Pires