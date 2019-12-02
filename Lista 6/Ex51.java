import java.util.Scanner;

public class Ex51 {

	public static void main (String[] args) {
		int nTermos, a=0, b=0, c=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a qnt de termos da sequencia: ");
		nTermos = sc.nextInt();
		nTermos--;

		for(int i=0; i<=nTermos; i++){
			if(i==1){
				a = 1;
			}
			c = a + b;
			a = b;
			b = c;

			System.out.print(c+" ");
		}
	}
}

//Gabriel Antonio Santos Pires
