package exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println(mdc(255,150));
    }

    public static double mdc(int x, int y) {
        if (y <= x && x % y == 0) {
            return y;
        }
        else if (x < y) {
            return mdc(x,y);
        }
        else {
            return mdc(y,x%y);
        }
    }
}
