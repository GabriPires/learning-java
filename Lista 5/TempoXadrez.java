import java.util.Scanner;

public class TempoXadrez {

	public static void main (String[] args) {
		int hrInicial, hrFinal, hrTotal=0;
		Scanner s = new Scanner(System.in);

		System.out.print("Que horas comecou a partida? ");
		hrInicial = s.nextInt();
		System.out.print("Que horas acabou a partida? ");
		hrFinal = s.nextInt();

		if(hrInicial < hrFinal){
			hrTotal = hrFinal - hrInicial;
		}
		else{
			hrTotal = (24 - hrInicial) + hrFinal;
		}

		System.out.println("A parida durou "+hrTotal+" horas");
	}
}

//Gabriel Antonio Santos Pires
