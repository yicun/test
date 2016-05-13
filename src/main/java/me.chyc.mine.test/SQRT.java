package me.chyc.mine.test;

/**
 * Created by yicun.chen on 3/6/16.
 */
public class SQRT {
    public static double sqrt(int n, int num) {
        int rs_int = 0;
        int rs_seg = 1;
        int seg = 1;
        while (n / seg / seg > 9)
            seg *= 10;

        do {

            while (n * rs_seg * rs_seg > (rs_int + seg) * (rs_int + seg)) {
                rs_int += seg;
            }

            seg /= 10;

            if (seg == 0) {
                num--;
                rs_seg *= 10;
                rs_int *= 10;
                seg = 1;
            }

        } while (num >= 0);

        return rs_int / (double) rs_seg;
    }

    public static void main(String args[]) {
        int n = 200;
        int num = 3;
        for (int i = 0; i <= num; i++) {
            System.out.println(sqrt(n, i));
        }
    }

}
