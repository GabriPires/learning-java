import java.util.Scanner;

public class Ex54 {

	public static void main (String[] args) {
		int tInicial, tFinal, a=0, b=0, c=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o termo inicial: ");
		tInicial = sc.nextInt();
		System.out.print("Digite o termo final: ");
		tFinal = sc.nextInt();

		for(int i=0; i<=tFinal; i++){
			if(i>=tInicial && i<=tFinal){
				System.out.print(a+" ");
			}
			if(i==0){
				a=1;
			}
			c = a + b;
			a = b;
			b = c;
			
			//System.out.print(c+" ");

			
		}
	}
}

//Gabriel Antonio Santos Pires
