package com.daft.exercise;
import java.util.Arrays;
import java.util.Scanner;
//eliminate duplicates
public class CH_7_15 {
    public static int[] eliminateDuplicates(int[] list) {
        int[] newList = new int[list.length];
        int newListCount = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isThereDuplicates = false;
            for (int k = 0; k < i; k++) {
                if (newList[k] == list[i]) {
                    isThereDuplicates = true;
                    break;
                }
            }
            if (!isThereDuplicates) {
                newList[newListCount] = list[i];
                newListCount++;
            }
        }
        int[] finalResult = new int[newListCount];
        System.arraycopy(newList, 0, finalResult, 0, newListCount);
        return finalResult;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("The distinct numbers are: " + Arrays.toString(eliminateDuplicates(list)));
    }
}
