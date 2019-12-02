import java.util.Random;

class Ex11 {
    public static void main(String[] args) {
        Random rd = new Random();
        int qa[] = new int[5];
        int qb[] = new int[5];
        int qc[] = new int[10];

        System.out.println("A | B");
        for (int i = 0; i < qa.length; i++) {
            qa[i] = rd.nextInt(10) + 1;
            qb[i] = rd.nextInt(10) + 1;

            System.out.println(qa[i] + "|" + qb[i]);
        }

        System.out.println("C");
        int j=0;
        for (int i = 0; i < 10; i += 2) {
            qc[i] = qa[j];
            qc[i + 1] = qb[j];
            System.out.println(qc[i] + "\n" + qc[i + 1]);
            j++;
        }
    }
}

//Gabriel Antonio Santos Pires

/*
i qca qcb
0  0   1
2  2   3
4  4   5
*/