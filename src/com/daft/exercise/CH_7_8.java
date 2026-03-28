package com.daft.exercise;
import java.util.Scanner;
//average an array
public class CH_7_8 {
    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] valuesList = new double[10];
        System.out.print("Enter ten double values: ");
        for (int i = 0; i < 10; i++) {
            valuesList[i] = input.nextDouble();
        }
        System.out.println("The average of the values is " + average(valuesList));
    }
}
