import java.util.Scanner;

public class Ex18 {

	public static void main (String[] args) {
		String frase;
		int cont=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();

		if(frase.length() == 8){
			for(int i=0;i<frase.length();i++){
				if(frase.toLowerCase().charAt(i) == '0' || frase.toLowerCase().charAt(i) == '1'){
					cont++;
				}
			}
			if(frase.length() == cont){
				System.out.println("e uma sequencia");
			}
			else{
				System.out.println("nao e uma sequencia");
			}
		}
		else{
			System.out.println("nao e uma sequencia");
		}
	}
}

//Gabriel Antonio Santos Pires