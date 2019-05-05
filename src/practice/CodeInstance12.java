package practice;//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

public class CodeInstance12 {

    public static void main(String[] args) {
        double res1 = power(0, 11);
        System.out.println(res1);

    }

    public static double power(double base, int exponent) {
        if (base <1e-15) return 0;
        if (exponent == 0) return 1;
        boolean isPosNum = (exponent > 0);
        exponent = isPosNum ? exponent : -exponent;
        double result = 1;
        double temp = base;
        while (exponent != 0) {
            if ((exponent & 1) == 1) {
                result *= temp;
                System.out.println("---------------" + result);
            }
            temp *= temp;
            System.out.println("+++++++++++++++++++" + temp);
            exponent = exponent >> 1;
        }
        return isPosNum ? result : (1 / result);


    }


}
