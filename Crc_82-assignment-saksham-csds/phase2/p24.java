public class armstrong {
    public static void main(String[] agrs) {
        int i, t1, t2, co = 0, rem = 0, AV = 0, t3, j;
        for (i = 1; 1 > 0; i++) {
            t1 = i;
            while (t1 > 0) {
                co++;
                t1 /= 10;
            }
            t2 = i;
            while (t2 > 0) {
                rem = t2 % 10;
                AV += Math.pow(rem, co);
                t2 /= 10;
            }
            if (AV == i) {
                t3 = i;
                for (j = 2; j < t3; j++) {
                    if (t3 % j == 0) {
                        break;
                    }
                }
                if (j == t3) {
                    System.out.print(t3 + ",");
                }
            }
            AV = 0;
            co = 0;
        }
    }
}