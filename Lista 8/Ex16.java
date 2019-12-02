import java.util.Scanner;

class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 1, c = 1;

        do {
            System.out.print("Insira o numero de termos da sequencia de fibonacci: ");
            n = sc.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Valor invalido tente novamente.");
            }
        } while (n < 0 || n > 20);

        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = a;
            c = a + b;
            a = b;
            b = c;

            System.out.print(v[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires