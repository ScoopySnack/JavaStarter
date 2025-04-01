package gr.aueb.cf.ch5_floats;

public class PowerAppRecursive {

    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(power(i,i));
        }
    }

    public static int power(int a, int n){
        int result;
        if (n == 0) return  1;
        return power(a, n-1) * a;
    }
}
