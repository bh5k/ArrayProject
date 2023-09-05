package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ArrayProject {
    public static void main(String[] args) {

        Integer [] arrayOfInts = {1,5,3,7,2,8,9};

        System.out.println(Arrays.toString(arrayOfInts));

        String [] arrayOfNames = {"Bryan", "Sara", "Jack"};

        System.out.println(arrayOfNames[2]);

        Arrays.sort(arrayOfNames);

        System.out.println(Arrays.toString(arrayOfNames));

        Arrays.sort(arrayOfNames, Collections.reverseOrder());

        System.out.println(Arrays.toString(arrayOfNames));

        Arrays.sort(arrayOfInts, Collections.reverseOrder());

        System.out.println(Arrays.toString(arrayOfInts));
    }
}