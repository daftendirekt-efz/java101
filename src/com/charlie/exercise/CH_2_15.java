package com.charlie.exercise;
import java.util.Scanner;
public class CH_2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2, result, rootedResult;
        System.out.print("Enter x1 and y1: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        result = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        rootedResult = Math.pow (result, 0.5);
        System.out.println("The distance between the two points is " + rootedResult);
    }
}
