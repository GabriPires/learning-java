import java.util.Scanner;
import java.util.Random;

class Ex4 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int linhas = 0, colunas = 0, max = 0;

        do {
            System.out.print("Insira o numero de linhas da matriz: ");
            linhas = sc.nextInt();
            System.out.print("Insira o numero de colunas da matriz: ");
            colunas = sc.nextInt();
            System.out.print("Insira o numero maximo aleatorio: ");
            max = sc.nextInt();
        } while ((linhas < 1) || (colunas < 1));

        int[][] d = new int[linhas][colunas];

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                d[i][j] = rd.nextInt(max) + 1;
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Gabriel Antonio Santos Pires