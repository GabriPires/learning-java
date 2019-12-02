import java.util.Scanner;

public class Ex16 {

	public static void main (String[] args) {
		String frase;
		int contM=0, i=0, j=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();

		for(j=65;j<=90;j++){
			for(i=0;i<frase.length();i++){
				if(frase.charAt(i) == (char)j){
					contM++;
				}
			}
		}
		if(contM != 0){
			System.out.println("Tem maiusculo");
		}
		else{
			System.out.println("Nao tem maiusculo");
		}
		
	}
}

//Gabriel Antonio Santos Pires