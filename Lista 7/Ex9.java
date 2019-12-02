import java.util.Scanner;

public class Ex9 {

	public static void main (String[] args) {
		String frase;
		int cont=0, sp=32;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();

		for(int i=0;i<frase.length();i++){
			if(frase.toLowerCase().charAt(i) == (char)sp){
				cont++;
			}
		}

		System.out.print("Letras A na frase: "+cont);

	}
}

//Gabriel Antonio Santos Pires