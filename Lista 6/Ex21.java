import java.util.Scanner;

public class Ex21 {

	public static void main (String[] args) {
		int i, v, maior=0, qnt, soma=0, media;
		Scanner s = new Scanner(System.in);

		System.out.print("Quantos numeros serao lidos? ");
		qnt = s.nextInt();

		for(i=1;i<=qnt;i++){
			System.out.print("Insira o "+i+" valor: ");
			v = s.nextInt();
			if(i==1){
				maior=v;
			}
			if(v > maior){
				maior = v;
			}
			soma+=v;
		}

		media = soma / qnt;

		System.out.println("Maior valor: "+maior);
		System.out.println("Media: "+media);
	}
}
