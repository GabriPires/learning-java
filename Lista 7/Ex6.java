import java.util.Scanner;

public class Ex6 {

	public static void main (String[] args) {
		String frase;
		String letra;
		int cont=0;
		Scanner sc = new Scanner(System.in);
		//Scanner scc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();
		System.out.print("Escreva uma letra a ser verificada: ");
		letra = sc.nextLine();

		for(int i=0;i<frase.length();i++){
			if(frase.toLowerCase().charAt(i) == letra.toLowerCase().charAt(0)){
				cont++;
			}
		}

		System.out.print("Letras "+letra+" na frase: "+cont);

	}
}

//Gabriel Antonio Santos Pires