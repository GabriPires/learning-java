import java.util.Scanner;

public class Ex8 {

	public static void main (String[] args) {
		String frase;
		int cont=0, i=0, j=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();

		for(j=97;j<=122;j++){
			cont = 0;
			for(i=0;i<frase.length();i++){
				if(frase.toLowerCase().charAt(i) == (char)j){
					cont++;
				}
			}
			if(cont!=0){
				System.out.println("Letras "+(char)j+" na frase: "+cont);
			}
		}
	}
}

//Gabriel Antonio Santos Pires