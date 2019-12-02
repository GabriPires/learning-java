import java.util.Random;
import java.util.Scanner;

class Ex6 {
    public static void main(String[] args) {
        int n = 0;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Insira o tamanho dos vetores: ");
            n = sc.nextInt();
        } while (n > 15 || n <= 0);

        int a[] = new int[n];
        int b[] = new int[n];

        System.out.println("i | a | b");
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(5) + 1;
            b[i] = rd.nextInt(5) + 1;
            System.out.println(i + " | " + a[i] + " | " + b[i]);
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                System.out.println("E igual na posicao " + i);
            }
        }
    }
}

//Gabriel Antonio Santos Pires