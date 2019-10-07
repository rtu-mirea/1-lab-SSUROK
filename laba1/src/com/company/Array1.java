package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

    private int length;
    private short x[];


    Array1(int length) throws Exception {
        if (length <= 0) throw new Exception(new String("Number of elements <=0"));
        this.length = length;
        x = new short[this.length];
    }

    void randInput(int max, int min) {
        for (int i = 0; i < length; i++) {
            x[i] = (short) (Math.random() * (max - min) + min);
        }
    }

    void consolInput() {
        System.out.println("Enter " + length + " numbers");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            x[i] = in.nextShort();
        }
    }

    void consolOutputArrays() {
        System.out.println("Your array");
        System.out.println(Arrays.toString(x));
    }

    void consolOutputArrayFromLastTo1() {
        System.out.println("Your array (from last to 1)");
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(x[i]);
        }
    }

    void arrayBiggerThenInput() {
        System.out.println("insert number");
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int k = 0;
        for (int i = 0; i < length; i++) {
            if (x[i] > b) {
                k++;
            }
        }
        System.out.println("number of elements " + k);
    }

    void insertionSort() {
        short temp;
        int item;
        for (int counter = 1; counter < length; counter++) {
            temp = x[counter];
            item = counter - 1;
            while (item >= 0 && x[item] > temp) {
                x[item + 1] = x[item];
                x[item] = temp;
                item--;
            }
        }
        System.out.println("Your array");
        System.out.println(Arrays.toString(x));
    }
}


