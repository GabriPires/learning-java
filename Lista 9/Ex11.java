import java.util.Scanner;
import java.util.Random;

class Ex11 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Insira a dimensao da matriz quadrada: ");
            n = sc.nextInt();
        } while (n < 1);
        int[][] k = new int[n][n];

        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                k[i][j] = rd.nextInt(9) + 1;
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal abaixo da principal");
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                if (i == j) {
                    if ((i != 0 && j != 0)) {
                        System.out.print(k[i][j - 1] + " ");
                        System.out.print(k[i][j] + " ");
                    }
                    else{
                        System.out.print("  "+k[i][j] + " ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//Gabriel Antonio Santos Pires