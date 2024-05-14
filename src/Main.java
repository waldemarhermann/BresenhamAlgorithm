public class Main {

    public static void main(String[] args) {
        System.out.println("Ergebnis 1A:\n(x, y, en)\n");
        bresenhamAlgorithm(2, 3, 11, 8);
    }

    public static void bresenhamAlgorithm(int x0, int y0, int x1, int y1) {

        int dx = x1 - x0;
        int dy = y1 - y0;
        int x = x0;
        int y = y0;
        int e = 2 * dy - dx;

        while (x <= x1) {
            System.out.println("(" + x + ", " + y + ", " + e + ")");
            if (e >= 0) {
                y += 1;
                e += 2 * (dy -dx);
            } else {
                e += 2 * dy;
            }
            x += 1;
        }
    }
}