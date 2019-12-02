import java.util.Random;
import java.util.Scanner;

class Ex5{
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int linhas = 0, colunas = 0;

        do {
            System.out.print("Insira o numero de linhas da matriz: ");
            linhas = sc.nextInt();
            System.out.print("Insira o numero de colunas da matriz: ");
            colunas = sc.nextInt();
        } while ((linhas < 1) || (colunas < 1));

        int[][] m1 = new int[linhas][colunas];
        int[][] m2 = new int[linhas][colunas];
        int[][] m3 = new int[linhas][colunas];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = rd.nextInt(9) + 1;
                m2[i][j] = rd.nextInt(9) + 1;
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println();
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[0].length; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Gabriel Antonio Santos Pires