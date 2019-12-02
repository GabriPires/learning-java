import java.util.Random;
import java.util.Scanner;

class Ex5{
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
        int c[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(50) + 1;
            b[i] = rd.nextInt(50) + 51;
            c[i] = a[i] + b[i];
            System.out.println(a[i]+"+"+b[i]+"="+c[i]);
        }
    }
}

//Gabriel Antonio Santos Pires