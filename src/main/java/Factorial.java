public class Factorial {

    public static long factor(int n) {

        if (n == 1 || n==0) {
            return 1;
        }
        if (n<0){
            throw  new IllegalArgumentException();
        }
        return factor(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(factor(0));
        System.out.println(factor(1));
        System.out.println(factor(2));
    }
}
