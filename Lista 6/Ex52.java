import java.util.Scanner;

public class Ex52 {

	public static void main (String[] args) {
		int n, a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com um numero para comparar: ");
		n = sc.nextInt();

		for(int i=0; c<n; i++){
			if(i==1){
				a = 1;
			}
			c = a + b;
			a = b;
			b = c;
		}
		
		if(c == n){
			System.out.println(n+" percente a sequencia de fibbonacci");
		}
		else{
			System.out.println(n+" nao percente a sequencia de fibbonacci");
		}

	}
}

//Gabriel Antonio Santos Pires
