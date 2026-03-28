package com.daft.exercise;
import java.util.Scanner;
//computing gcd
public class CH_7_14 {
    public static int gcd(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        } else {
            int result = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                result = gcdTwoNumbers(result, numbers[i]);
            }
            return result;
        }
    }
    public static int gcdTwoNumbers(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The gcd of these numbers is " + gcd(numbers));
    }
}
