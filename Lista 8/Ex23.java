import java.util.Random;

class Ex23 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] ad = new int[10];
        int aux = 0, c = 0, j = 0;

        for (int i = 0; i < ad.length; i++) {
            ad[i] = rd.nextInt(10) + 1;
            System.out.print(ad[i] + ", ");
            if (ad[i] % 2 == 0) {
                c++;
            }
        }
        int[] vaux = new int[c];

        for (int i = 0; j < vaux.length; i++) {
            if (ad[i] % 2 == 0) {
                vaux[j] = ad[i];
                j++;
            }
        }

        for (int i = 0; i < vaux.length; i++) {
            for (j = 0; j < (vaux.length - 1); j++) {
                if (vaux[j] > vaux[j + 1]) {
                    aux = vaux[j];
                    vaux[j] = vaux[j + 1];
                    vaux[j + 1] = aux;
                }
            }
        }

        j=0;
        for (int i = 0; j < vaux.length; i++) {
            if (ad[i] % 2 == 0) {
                ad[i] = vaux[j];
                j++;
            }
        }

        System.out.print("\n");
        for (int i = 0; i < ad.length; i++) {
            System.out.print(ad[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires