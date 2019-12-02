import java.util.Scanner;

public class Ex60 {

	public static void main (String[] args) {
		int a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o primeiro termo: ");
		a = sc.nextInt();
		System.out.print("Entre com o segundo termo: ");
		b = sc.nextInt();
		System.out.print("Entre com um numero: ");
		int n = sc.nextInt();
		

		for(int i=0; c<n; i++){
			c = a + b;
			a = b;
			b = c;

			System.out.print(c+" ");
		}
		
		if(c==n){
			System.out.print("\n"+n+" pertence a sequencia de Ricci");
		}
		else{
			System.out.print("\n"+n+" nao pertence a sequencia de Ricci");
		}
	}
}

//Gabriel Antonio Santos Pires
