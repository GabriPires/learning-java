import java.util.Scanner;

public class MaiorValor {

	public static void main (String[] args) {
		int v1, v2;
		Scanner s = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		v1 = s.nextInt();
		System.out.print("Digite outro valor diferente: ");
		v2 = s.nextInt();

		if(v1 == v2){
			System.out.println("Insira valores diferentes.");
		}
		else if(v1>v2){
			System.out.println("O maior valor e "+v1);
		}
		else{
			System.out.println("O maior valor e "+v2);
		}
	}
}

//Gabriel Antonio Santos Pires
