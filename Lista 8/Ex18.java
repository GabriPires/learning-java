import java.util.Scanner;
import java.util.Random;

class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = 0, fat = 1, c = 0;

        do {
            System.out.print("Insira a quantidade da sequencia de fatoriaias: ");
            n = sc.nextInt();
        } while (n <= 0 || n > 15);

        int[] y = new int[n];

        for (int i = 1; i <= n; i++) {
            fat = 1;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            y[c] = fat;
            System.out.print(y[c] + ", ");
            c++;
        }
    }
}

//Gabriel Antonio Santos Pires