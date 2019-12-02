import java.util.Scanner;

public class Ex43 {

	public static void main (String[] args) {
		int i, c, n, f=1;
		Scanner sc = new Scanner(System.in);

		for(c=1;c<=7;c++){
			f=1;
			System.out.print("Insira um numero: ");
			n = sc.nextInt();

			for(i=1;i<=n;i++){
				f*=i;
			}
			System.out.println("Fatorial: "+f);
		}
	}
}

//Gabriel Antonio Santos Pires
