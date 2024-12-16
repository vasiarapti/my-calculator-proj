package gr.aueb.cf.ch3;

public class MulCalculator {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 6;
        int result = mul(num1,num2);

        System.out.println("Mul: " + result);
    }

    public static int mul(int a, int b) {
        return a*b;
    }
}
