import java.util.Scanner;

public class AprovadoReprovado {

	public static void main (String[] args) {
		int nota;

		Scanner entrada = new Scanner(System.in);

    System.out.print("Digite sua nota: ");
    nota = entrada.nextInt();

		if(nota > 10 || nota < 0){
			System.out.println("VALOR INVALIDO");
		}
		else{
			if(nota < 6){
				System.out.println("REPROVADO");
			}
			else{
				System.out.println("APROVADO");
			}
		}
	}
}

//Gabriel Antonio Santos Pires
