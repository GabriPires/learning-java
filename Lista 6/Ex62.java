import java.util.Scanner;

public class Ex62 {

	public static void main (String[] args) {
		int i, nt, a=2, b=1, aux=1;
		double soma=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de termos: ");
		nt = sc.nextInt();

		for(i=1;i<=nt;i++){
			if(aux == 1){
				soma+=(double)a/b;
				System.out.print(a+"/"+b+" - ");
				a+=2;
				b+=2;
				aux++;
			}
			else if(aux == 2){
				soma-=(double)a/b;
				System.out.print(a+"/"+b+" + ");
				a+=2;
				b+=2;
				aux--;
			}
		}
		System.out.println("\nSoma: "+soma);
	}
}

//Gabriel Antonio Santos Pires
