package org.example;

public class DZ5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int sum1 = a + b;
        int sum2 = c + d;
        System.out.println(sum1 > sum2);

        sum1 += 1;
        sum2 -= 2;

        System.out.println(sum1 > sum2);

        boolean isEitherSumEven = (sum1 % 2 == 0) || (sum2 % 2 == 0);
        System.out.println(isEitherSumEven);
    }
}
