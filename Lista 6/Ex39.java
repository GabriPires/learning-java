import java.util.Scanner;

public class Ex39 {

	public static void main (String[] args) {
		int n=0, i, c=1;
		double soma=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de termos: ");
		do{
			n = sc.nextInt();
		}while(n<0);

		if(n==0){
			System.out.print("Programa encerrado");
		}
		else{
			c=n;
			for(i=1;i<=n;i++){
					System.out.print(i+"/"+c+", ");
					soma+=(double)i/c;
					c--;
			}
			System.out.println("\nSoma: "+soma);
		}
	}
}

//Gabriel Antonio Santos Pires
