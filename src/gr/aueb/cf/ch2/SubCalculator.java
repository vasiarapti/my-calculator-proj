package gr.aueb.cf.ch2;

public class SubCalculator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        int result = sub(num1, num2);
        System.out.println(result);
    }

    public static int sub(int a, int b) {
        return a-b;
    }
}