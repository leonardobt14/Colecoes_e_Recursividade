package exercicio3;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println(recursiva(1,0));
    }

    public  static double recursiva(double X ,int N) {
            if (N == 0) {
                return 1;
            }
            else {
                return X*recursiva(X,N-1);
            }
    }
}
