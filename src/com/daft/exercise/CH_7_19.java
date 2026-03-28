package com.daft.exercise;
import java.util.Scanner;
//sorted?
public class CH_7_19 {
    public static boolean isSorted(int[] list) {
        int[] newList = new int[list.length];
        System.arraycopy(list, 0, newList, 0, list.length);
        java.util.Arrays.sort(newList);
        return newList == list;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < length; i++) {
            list[i] = input.nextInt();
        }
        if (isSorted(list)) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }
}
