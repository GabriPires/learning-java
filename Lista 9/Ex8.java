import java.util.Random;

class Ex8 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = 0, m = 0, contPar = 0, contImpar = 0;;

        n = rd.nextInt(5) + 1;
        m = rd.nextInt(5) + 1;

        int[][] f = new int[n][m];

        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[0].length; j++) {
                f[i][j] = rd.nextInt(50) + 1;
                System.out.print(f[i][j] + " ");
                if (f[i][j] % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
            System.out.println();
        }

        if (contPar > 0) {
            int[] par = new int[contPar];
            contPar = 0;
            for (int i = 0; i < f.length; i++) {
                for (int j = 0; j < f[0].length; j++) {
                    if (f[i][j] % 2 == 0) {
                        par[contPar] = f[i][j];
                        contPar++;
                    }
                }
            }
            System.out.print("Pares: ");
            for (int i = 0; i < par.length; i++) {
                System.out.print(par[i] + " ");
            }
            System.out.println();
        } else {
            System.out.print("Nao ha numero par.");
        }

        if (contImpar > 0) {
            int[] impar = new int[contImpar];
            contImpar = 0;
            for (int i = 0; i < f.length; i++) {
                for (int j = 0; j < f[0].length; j++) {
                    if (f[i][j] % 2 != 0) {
                        impar[contImpar] = f[i][j];
                        contImpar++;
                    }
                }
            }
            System.out.print("Impares: ");
            for (int i = 0; i < impar.length; i++) {
                System.out.print(impar[i] + " ");
            }
            System.out.println();
        } else {
            System.out.print("Nao ha impar");
        }
    }
}

//Gabriel Antonio Santos Pires