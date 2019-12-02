import java.util.Random;

class Ex24 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] ae = new int[10];
        int aux = 0, c = 0, j = 0;

        for (int i = 0; i < ae.length; i++) {
            ae[i] = rd.nextInt(10) + 1;
            System.out.print(ae[i] + ", ");
            if (ae[i] % 2 != 0) {
                c++;
            }
        }
        int[] vaux = new int[c];

        for (int i = 0; j < vaux.length; i++) {
            if (ae[i] % 2 != 0) {
                vaux[j] = ae[i];
                j++;
            }
        }

        for (int i = 0; i < vaux.length; i++) {
            for (j = 0; j < (vaux.length - 1); j++) {
                if (vaux[j] < vaux[j + 1]) {
                    aux = vaux[j];
                    vaux[j] = vaux[j + 1];
                    vaux[j + 1] = aux;
                }
            }
        }

        j=0;
        for (int i = 0; j < vaux.length; i++) {
            if (ae[i] % 2 != 0) {
                ae[i] = vaux[j];
                j++;
            }
        }

        System.out.print("\n");
        for (int i = 0; i < ae.length; i++) {
            System.out.print(ae[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires