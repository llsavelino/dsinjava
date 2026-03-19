import Utils.Utils;

public class Others {

    private static boolean mn(int z, int o) {return z < o;}
    private static boolean mm(int z, int o) {return z > o;}
    private static boolean eq(int z, int o) {return z == o;}
    private static boolean ex(int z, int o) {return z >= o;}
    private static boolean ei(int z, int o) {return z <= o;}

    public static int fac(final int n) {

        if (n < 3) return (int)((n < 0) ? -1 : (n == 0) ? 1 : n);

        return (n * fac(n - 1));
    }

    public static int fib(final int n) {

        if (n < 3) return (n == 0) ? n : ((n < 0) ? -1 : 1);

        return fib(((n) - 1)) + fib(((n) - 2));
    }

    public static double pow(final double b, int e) {

        if (e <= 0) return (e == 0) ? 1 : -1;
        if (e == 1 || b == 0 || b == 1) return b;

        return +(b * pow(b, --e));
    }

    public static int binarySearchC(
            final int[] v,
            final int x, final int l, final int h
    ) {

        if (l > h || !Utils.is0toN(v, v.length)) return -1;
        int C = (l + h) / 2;

        if (eq(v[C], x)) return C;
        else if (v[C] > x) return binarySearchC(v, x, l, C--);
        else if (v[C] < x) return binarySearchC(v, x, C++, h);
        return 0;
    }

    public static int binarySearchD(
            final int[] v,
            final int x, final int l, final int h
    ) {

        if (l > h || !Utils.isNto0(v, v.length)) return -1;
        int C = (l + h) / 2;

        if (eq(v[C], x)) return C;
        else if (v[C] < x) return binarySearchD(v, x, l, C--);
        else if (v[C] > x) return binarySearchD(v, x, C++, h);
        return 0;
    }

    public static void Hanoi(int n, String or, String dt, String aux) {
        if (n == 1) {
            System.out.println("Mova disco do pino: " + or + " para o pino " + dt);
        } else {
            Hanoi(n - 1, or, aux, dt);
            System.out.println("Mova disco do pino: " + or + " para o pino " + dt);
            Hanoi(n - 1, aux, dt, or);
        }
    }
}


