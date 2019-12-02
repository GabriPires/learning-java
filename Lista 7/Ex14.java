import java.util.Scanner;

public class Ex14 {

	public static void main (String[] args) {
		String frase, letra;
		int cont=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();
		System.out.print("Escreva uma letra para verificacao: ");
		letra = sc.nextLine();
		

		for(int i=0;i<frase.length();i++){
			if(frase.toLowerCase().charAt(i) == letra.toLowerCase().charAt(0)){
				frase = frase.replace(letra.charAt(0),'*');
			}
		}

		System.out.print(frase);

	}
}

//Gabriel Antonio Santos Pires