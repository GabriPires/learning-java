import java.util.Scanner;

public class Ex17 {

	public static void main (String[] args) {
		String frase1, frase2;
		int cont=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase1 = sc.nextLine();
		System.out.print("Escreva uma frase: ");
		frase2 = sc.nextLine();

		if(frase1.length() == frase2.length()){
			for(int i=0;i<frase1.length();i++){
				if(frase1.toLowerCase().charAt(i) == frase2.toLowerCase().charAt(i)){
					cont++;
				}
			}
			if(frase1.length() == cont){
				System.out.println("Sao iguais");
			}
			else{
				System.out.println("Nao sao iguais");
			}
		}
		else{
			System.out.println("Nao sao iguais");
		}
	}
}

//Gabriel Antonio Santos Pires