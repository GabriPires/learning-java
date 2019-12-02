import java.util.Scanner;

public class Ex23 {

	public static void main (String[] args) {
		int numFilhos, salario, somaSal=0, somaFilhos=0, c=1, maiorSal=0;
		double mediaSal=0, mediaFilhos=0, perc=0;
		Scanner sc = new Scanner(System.in);

		do{
			System.out.print("Entre com o salario: ");
			salario = sc.nextInt();
			if(salario > 0){
				System.out.print("Entre com o numero de filhos: ");
				numFilhos = sc.nextInt();

				somaSal+=salario;
				somaFilhos+=numFilhos;

				if(c==1){
					maiorSal = salario;
				}
				else if(maiorSal < salario){
					maiorSal = salario;
				}

				if(salario < 150){
					perc++;
				}

				c++;
			}
		}while(salario > 0);

		c--;
		mediaFilhos = (double)somaFilhos / c;
		mediaSal = (double)somaSal / c;
		perc = (double)(perc/c)*100;
		System.out.println("\nMedia de salario: R$"+mediaSal+"\nMedia de num de filhos: "+mediaFilhos+"\nMaior salario: R$"+maiorSal+"\nPerc de pessoas que recebem menos que R$150,00: "+perc+"%");
	}
}

//Gabriel Antonio Santos Pires
