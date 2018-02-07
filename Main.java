package com.dnxth;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int[] myArray = getIntegers(5);

        sort(myArray);
        printArray(myArray);



    }

    public static int[] getIntegers(int number) {
        int[] array2 = new int[number];
        System.out.println("Enter " + number + " nubers   \r");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        return array2;
    }

    public static int[] sort(int[] array) {

        int i,j = 0;
        int temp = 0;
//        System.out.println("came in");

        for (i = 0; i < array.length; i++) {

            for (j = i+1; j < array.length; j++) {

                if (array[i] < array[j]) {

                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        return array;
    }


    public static void printArray(int[] array) {

        int i = 0;
        for (i = 0; i < array.length; i++) {

            System.out.println(" the new items in array are " + array[i]);
        }
    }





}