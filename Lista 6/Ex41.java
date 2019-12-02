import java.util.Scanner;

public class Ex41 {

	public static void main (String[] args) {
		int i, n, f=1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um numero: ");
		n = sc.nextInt();

		for(i=1;i<=n;i++){
			f*=i;
		}
		System.out.println("Fatorial: "+f);
	}
}

//Gabriel Antonio Santos Pires
