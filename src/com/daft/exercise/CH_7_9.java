package com.daft.exercise;
import java.util.Scanner;
//find the smallest element
public class CH_7_9 {
    public static double min(double[] array) {
        double minimumValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimumValue) {
                minimumValue = array[i];
            }
        }
        return minimumValue;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] inputArray = new double[10];
        for (int i = 0; i < 10; i++) {
            inputArray[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(inputArray));
    }
}
