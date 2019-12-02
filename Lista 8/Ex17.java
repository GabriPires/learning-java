import java.util.Scanner;

class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c = 0;

        do {
            System.out.print("Insira o numero de termos primos: ");
            n = sc.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Valor invalido tente novamente.");
            }
        } while (n < 0 || n > 20);

        int[] x = new int[n];

        int p = 0;
        for (int i = 2; p < n; i++) {
            c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                x[p] = i;
                System.out.print(x[p] + ", ");
                p++;
            }
        }
    }
}

//Gabriel Antonio Santos Pires