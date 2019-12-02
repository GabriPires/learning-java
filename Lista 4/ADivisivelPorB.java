import java.util.Scanner;

public class ADivisivelPorB {

	public static void main (String[] args) {
		int a,b;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com o valor de A: ");
		a = entrada.nextInt();
		System.out.print("Entre com o valor de B: ");
		b = entrada.nextInt();

		if((a>1000||a<0)||(b>20||b<=0)){
			System.out.println("VALOR INVALIDO");
		}
		else{
			if(a%b==0){
				System.out.println(a+" e divisivel por "+b);
			}
			else{
				System.out.println(a+" nao e divisivel por "+b);
			}
		}
	}
}

//Gabriel Antonio Santos Pires
