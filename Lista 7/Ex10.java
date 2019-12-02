import java.util.Scanner;

public class Ex10 {

	public static void main (String[] args) {
		String frase;
		int cont=0, i=0, j=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();

		for(j=65;j<=90;j++){
			for(i=0;i<frase.length();i++){
				if(frase.charAt(i) == (char)j){
					cont++;
				}
			}
		}
		System.out.println("Letras maiusculas na frase: "+cont);
	}
}

//Gabriel Antonio Santos Pires