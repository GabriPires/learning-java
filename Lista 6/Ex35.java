import java.util.Scanner;

public class Ex35 {

	public static void main (String[] args) {
		int n=0, i, c=1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de termos: ");
		do{
				n = sc.nextInt();
		}while(n<0);

		if(n==0){
			System.out.print("Programa encerrado");
		}
		else{
			for(i=1;i<=n;i++){
				System.out.print(i+", "+i*-1+", ");
			}
		}



	}
}

//Gabriel Antonio Santos Pires
