import java.util.Scanner;
import java.util.Random;

class Ex9 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Insira a dimensao da matriz quadrada: ");
            n = sc.nextInt();
        } while (n < 1);
        int[][] g = new int[n][n];

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length; j++) {
                g[i][j] = rd.nextInt(9) + 1;
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal principal");
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if(i==j){
                    System.out.print(g[i][j] + " ");
                }
                else{
                    System.out.print("  ");
                }   
            }
            System.out.println();
        }
    }
}

//Gabriel Antonio Santos Pires