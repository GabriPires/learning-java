import java.util.Random;

class Ex14 {
    public static void main(String[] args) {
        Random rd = new Random();
        int s[] = new int[10];
        int t[] = new int[15];
        int u[] = new int[25];

        for (int i = 0; i < t.length; i++) {
            if (i < 10) {
                s[i] = rd.nextInt(10) + 1;
            }
            t[i] = rd.nextInt(10) + 1;
        }

        System.out.print("S ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + ", ");
        }
        System.out.print("\nT ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + ", ");
        }

        int conts = 0, contt = 0;
        System.out.print("\nU ");
        for (int k = 0; k < u.length;) {
            if (conts < s.length) {
                u[k++] = s[conts];
                conts++;
            }
            if (contt < t.length) {
                u[k++] = t[contt];
                contt++;
            }
        }

        for (int i = 0; i < u.length; i++) {
            System.out.print(u[i] + ", ");
        }
    }
}

//Gabriel Antonio Santos Pires