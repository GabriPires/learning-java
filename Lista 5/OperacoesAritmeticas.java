import java.util.Scanner;

public class OperacoesAritmeticas {

	public static void main (String[] args) {
		int a, b, r=0;
		char op;
		Scanner s = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		System.out.print("Primeiro valor: ");
		a = s.nextInt();
		System.out.print("Segundo valor: ");
		b = s.nextInt();
		System.out.print("Insira o operador aritmetico: ");
		op = sc.nextLine().charAt(0);

		if(op == '+'){
			r = a + b;
		}
		else if(op == '-'){
			r = a - b;
		}
		else if(op == '*'){
			r = a * b;
		}
		else if(op == '/'){
			if(b==0){
				System.out.println("Impossivel dividir por zero");
			}
			else{
			r = a / b;
			}
		}
		else{
			System.out.println("Operador invalido");
		}

		System.out.println("Resultado: " + r);
	}
}

//Gabriel Antonio Santos Pires
