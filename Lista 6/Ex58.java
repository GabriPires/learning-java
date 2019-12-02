import java.util.Scanner;

public class Ex58 {

	public static void main (String[] args) {
		int a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o primeiro termo: ");
		a = sc.nextInt();
		System.out.print("Entre com o segundo termo: ");
		b = sc.nextInt();

		for(int i=0; i<10; i++){
			c = a + b;
			a = b;
			b = c;

			System.out.print(c+" ");
		}
	}
}

//Gabriel Antonio Santos Pires
