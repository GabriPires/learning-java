import java.util.Scanner;

public class Ex61 {

	public static void main (String[] args) {
		int i, nt, a=2, b=1;
		double soma=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de termos: ");
		nt = sc.nextInt();

		for(i=1;i<=nt;i++){
			soma+=(double)a/b;
			System.out.print(a+"/"+b+" + ");
			a+=2;
			b+=2;
		}
		System.out.println("\nSoma: "+soma);
	}
}

//Gabriel Antonio Santos Pires
