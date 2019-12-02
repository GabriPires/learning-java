import java.util.Random;

class Ex12 {
    public static void main(String[] args) {
        Random rd = new Random();
        int p[] = new int[10];
        int q[] = new int[15];
        int r[] = new int[25];

        for (int i = 0; i < q.length; i++) {
            if (i < 10) {
                p[i] = rd.nextInt(10) + 1;
            }
            q[i] = rd.nextInt(10) + 1;
        }

        System.out.print("P ");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + ", ");
        }
        System.out.print("\nQ ");
        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + ", ");
        }

        int contp = 0, contq = 0;
        System.out.print("\nR ");
        for (int i = 0; i < r.length; i++) {
            if (i < 10) {
                r[i] = p[contp];
                contp++;
            } else {
                r[i] = q[contq];
                contq++;
            }
            System.out.print(r[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires