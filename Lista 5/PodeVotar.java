import java.util.Scanner;

public class PodeVotar {

	public static void main (String[] args) {
		int anoA, anoN, idade;
		Scanner s = new Scanner(System.in);

		System.out.print("Insira o ano atual: ");
		anoA = s.nextInt();
		System.out.print("Insira seu ano de nascimento: ");
		anoN = s.nextInt();

		idade = anoA - anoN;

		if(idade < 16){
			System.out.println("Voce nao pode votar");
		}
		else if(idade < 18){
			System.out.println("Voce pode votar");
		}
		else{
			System.out.println("Voce deve votar");
		}

	}
}

//Gabriel Antonio Santos Pires
