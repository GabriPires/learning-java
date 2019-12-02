import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main (String[] args) {
		int valor;
		Scanner s = new Scanner(System.in);

		System.out.print("Insira um valor: ");
		valor = s.nextInt();

		if(valor >= 0){
			System.out.println("Positivo");
		}
		else{
			System.out.println("Negativo");
		}
	}
}

//Gabriel Antonio Santos Pires
