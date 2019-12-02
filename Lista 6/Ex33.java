import java.util.Scanner;

public class Ex33 {

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
			for(i=0;i<n;i++){
				System.out.print(c+", ");
				c+=2;
			}
		}



	}
}

//Gabriel Antonio Santos Pires
