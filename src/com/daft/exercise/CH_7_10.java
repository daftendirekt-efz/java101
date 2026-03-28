package com.daft.exercise;
import java.util.Scanner;
//find the index of the smallest element
public class CH_7_10 {
    public static int indexOfSmallestElement(double[] array) {
        int index = 0;
        double smallestValue = array[0];
        for (int i = (array.length - 1); i >= 0; i--) {
            if (array[i] <= smallestValue) {
                index = i;
                smallestValue = array[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] inputArray = new double[10];
        for (int i = 0; i < 10; i++) {
            inputArray[i] = input.nextDouble();
        }
        System.out.println("The index of the smallest element is " + indexOfSmallestElement(inputArray));
    }
}
