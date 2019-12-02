import java.util.Scanner;
import java.util.Random;

class Ex3 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Entre com as dimensoes da matriz quadrada: ");
            n = sc.nextInt();
        } while (n <= 0 || n >= 20);

        int[][] c = new int[n][n];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                c[i][j] = rd.nextInt(100)+1;
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

//Gabriel Antonio Santos Pires