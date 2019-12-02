import java.util.Random;

class Ex25 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] af = new int[10];
        int aux = 0, cp = 0, ci = 0, j = 0;

        for (int i = 0; i < af.length; i++) {
            af[i] = rd.nextInt(10) + 1;
            System.out.print(af[i] + ", ");
            if (af[i] % 2 == 0) {
                cp++;
            } else {
                ci++;
            }
        }
        int[] par = new int[cp];
        int[] impar = new int[ci];

        cp = 0;
        ci = 0;
        for (int i = 0; i < af.length; i++) {
            if (af[i] % 2 == 0) {
                par[cp] = af[i];
                cp++;
            } else {
                impar[ci] = af[i];
                ci++;
            }
        }

        for (int i = 0; i < par.length; i++) {
            for (j = 0; j < (par.length - 1); j++) {
                if (par[j] > par[j + 1]) {
                    aux = par[j];
                    par[j] = par[j + 1];
                    par[j + 1] = aux;
                }
            }
        }

        j = 0;
        for (int i = 0; j < par.length; i++) {
            if (af[i] % 2 == 0) {
                af[i] = par[j];
                j++;
            }
        }

        for (int i = 0; i < impar.length; i++) {
            for (j = 0; j < (impar.length - 1); j++) {
                if (impar[j] < impar[j + 1]) {
                    aux = impar[j];
                    impar[j] = impar[j + 1];
                    impar[j + 1] = aux;
                }
            }
        }

        j = 0;
        for (int i = 0; j < impar.length; i++) {
            if (af[i] % 2 != 0) {
                af[i] = impar[j];
                j++;
            }
        }



        System.out.print("\n");
        for (int i = 0; i < af.length; i++) {
            System.out.print(af[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires