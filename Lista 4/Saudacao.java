import java.util.Scanner;
import java.util.Random;

public class Saudacao {

	public static void main (String[] args) {
		int hora=0, op;
		Scanner entrada = new Scanner(System.in);
		Random r = new Random();

		System.out.println("Deseja inserir a hora ou que seja gerada automaticamente?\n1-Inserir manualmente\n2-Gerar automaticamente");
		op = entrada.nextInt();

		if(op==1||op==2){
			if(op == 1){
				System.out.print("Insira a hora: ");
				hora = entrada.nextInt();
			}
			else if(op == 2){
				hora = r.nextInt(24);
			}

			if(hora <= 6){
				System.out.println("Zzz");
			}
			else if(hora <= 11){
				System.out.println("Bom dia");
			}
			else if(hora <= 17){
				System.out.println("Boa tarde");
			}
			else if(hora <= 23){
				System.out.println("Boa noite");
			}
			else{
				System.out.println("VALOR INVALIDO");
			}
		}
		else{
			System.out.println("OPCAO INVALIDA");
		}


	}
}

//Gabriel Antonio Santos Pires
