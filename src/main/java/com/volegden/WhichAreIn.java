package com.volegden;

import java.util.Arrays;
import java.util.TreeSet;

/*
Given two arrays of strings a1 and a2 return a sorted array r in
lexicographical order of the strings of a1 which are substrings of strings of a2.
*/

public class WhichAreIn {
    public static void main(String[] args) {

        // Showcase of function in console.
        System.out.println(Arrays.toString(inArray(
                new String[]{"arp", "live", "strong"},
                new String[]{"lively", "alive", "harp", "sharp", "armstrong"}
        )));
    }

    /**
     * Returns a sorted array of strings, containing the strings in array1 that are substrings of those in array2.
     * Using TreeSet - the elements are ordered using their natural ordering.
     */
    public static String[] inArray(String[] array1, String[] array2) {
        TreeSet<String> convToSubstringsSorted = new TreeSet<>();
        for (String i : array1) {
            for (String j : array2) {
                if (j.contains(i)) {
                    convToSubstringsSorted.add(i);
                }
            }
        }
        return convToSubstringsSorted.toArray(new String[0]);
    }
}
