import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		String frase, frase2 = "";
		int cont = 0, j = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();

		frase = frase.trim();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.toLowerCase().charAt(i) != (char) 32) {
				frase2 += frase.toLowerCase().charAt(i);
			}
		}

		frase = frase2;

		j = (frase.length()) - 1;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.toLowerCase().charAt(i) == frase.toLowerCase().charAt(j)) {
				cont++;
			}
			j--;
		}
		if (frase.length() == cont) {
			System.out.println("E palindromo");
		} else {
			System.out.println("Nao e palindromo");
		}
	}
}

//Gabriel Antonio Santos Pires