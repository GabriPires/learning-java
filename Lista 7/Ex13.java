import java.util.Scanner;

public class Ex13 {

	public static void main (String[] args) {
		String frase;
		int cont=0, i=0, j=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();

		for(j=97;j<=122;j++){
			if(j!=97&&j!=101&&j!=105&&j!=111&&j!=117){
				for(i=0;i<frase.length();i++){
					if(frase.toLowerCase().charAt(i) == (char)j){
						cont++;
					}
				}
			}
		}
		System.out.println("Consoantes na frase: "+cont);
	}
}

//Gabriel Antonio Santos Pires