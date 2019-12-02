import java.util.Scanner;

public class Ex15 {

	public static void main (String[] args) {
		String frase;
		int contL=0, contN=0, i=0, j=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva uma frase: ");
		frase = sc.nextLine();

		for(j=48;j<=57;j++){
			for(i=0;i<frase.length();i++){
				if(frase.toLowerCase().charAt(i) == (char)j){
					contN++;
				}
			}
		}
		if(contN != 0){
			System.out.println("Tem numero");
		}
		else{
			System.out.println("Nao tem numero");
		}
		
	}
}

//Gabriel Antonio Santos Pires