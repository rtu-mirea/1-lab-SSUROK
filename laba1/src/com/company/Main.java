package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testArray1();
    }

    public static void testArray1() {
        int n;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter number of elements");
            n = in.nextInt();
            Array1 array = new Array1(n);
            System.out.println("what type of creating array do you choose. 1-random; 2-by yourself");
            int b = in.nextInt();
            if (b == 1) {
                System.out.println("Enter min and max for array");
                int max = in.nextInt();
                int min = in.nextInt();
                array.randInput(max, min);
                array.consolOutputArrays();
            } else {
                array.consolInput();
                array.consolOutputArrays();
            }
            System.out.println("What do you want? \n 1) Output from first to last \n 2) Output from last to first \n 3) Count number of elements bigger than input \n 4) Sort array");
            int m = in.nextInt();
            switch (m){
                case 1:
                    array.consolOutputArrays();
                    break;
                case 2:
                    array.consolOutputArrayFromLastTo1();
                    break;
                case 3:
                    array.arrayBiggerThenInput();
                    break;
                case 4:
                    array.insertionSort();
                    break;
                default: System.out.println("Нету такого объекта. Выбирай из списка, ска");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("repeat?");
        int b = in.nextInt();
        if (b == 1) {
            testArray1();
        } else {
            return;
        }
    }
}
