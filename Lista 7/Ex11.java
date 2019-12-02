import java.util.Scanner;

public class Ex11 {

	public static void main (String[] args) {
		String frase;
		int contL=0, contN=0, i=0, j=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();

		for(j=97;j<=122;j++){
			for(i=0;i<frase.length();i++){
				if(frase.toLowerCase().charAt(i) == (char)j){
					contL++;
				}
			}
		}
		for(j=48;j<=57;j++){
			for(i=0;i<frase.length();i++){
				if(frase.toLowerCase().charAt(i) == (char)j){
					contN++;
				}
			}
		}
		System.out.println("Letras na frase: "+contL+"\nNum na frase: "+contN);
	}
}

//Gabriel Antonio Santos Pires