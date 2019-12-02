import java.util.Random;
import java.util.Scanner;


class Ex20 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x=0,y=0;
        int n = random.nextInt(10);
        int m = random.nextInt(10);
        int p = random.nextInt(10);

        int a[][] = new int[n][m];
        int b[][] = new int[n][p];
        int c[][] = new int[n][m + p];


        //Gerar Matriz A
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                a[i][k] = random.nextInt(10);
                System.out.print(a[i][k] + " ");

                c[i][k] = a[i][k];

            }
            System.out.print("\n");
        }
        System.out.println(" ---------------------- ");
        //Gerar Matriz B
        for (int i = 0; i < b.length; i++) {
            for (int k = 0; k < b[i].length; k++) {
                b[i][k] = random.nextInt(10);
                System.out.print(b[i][k] + " ");
                c[i][k + m] = b[i][k];
            }
            System.out.print("\n");
        }
        System.out.println(" ---------------------- ");
        for (int i = 0; i < c.length; i++) {
            for (int k = 0; k < c[i].length; ) {

                if (x < a.length) {
                    c[i][k++] = a[i][x++];
                }
                if (y < b.length) {
                    c[i][k++] = b[i][y++];
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int k = 0; k < c[i].length; k++) {
                System.out.print(c[i][k] + " ");
                
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}

//Gabriel Antonio Santos Pires