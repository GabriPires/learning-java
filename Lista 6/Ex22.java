import java.util.Scanner;

public class Ex22 {

	public static void main (String[] args) {
		int i, cod, val, soma=0, maior=0;
		double media;
		Scanner s = new Scanner(System.in);

		for(i=1;i<=3;i++){
			System.out.print("Insira o codigo do produto: ");
			cod = s.nextInt();
			System.out.print("Insira o valor do produto: ");
			val = s.nextInt();

			soma+=val;

			if(i==1){
				maior = val;
			}
			if(val > maior){
				maior = val;
			}
		}
		media = (double)soma / --i;
		System.out.println("Maior valor: R$"+maior);
		System.out.println("Media aritmetica: R$"+media);
	}
}
