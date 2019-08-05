package com.talfinder.assessment;

import java.util.Set;

public class GenerateSequence {


    public static Set<String> generateSequences(String input, int length) {
        /*
         * NOTE:
         * 1. Write your solution within this method
         * 2. Do not make changes to the Class Name, Method Name or Method Signature
         * 3. Use the Run-Java command to run main method
         * 4. Use the BuildAndRunTests command to evaluate your solution
         */

        Set<String> set = null;
        return set;

    }

    public static void main(String[] args) {

        String input = "abcdef";
        int length = 3;

        Set<String> array = GenerateSequence.generateSequences(input, length);
        if (array != null) {
            for (String sequence : array) {
                System.out.println(sequence);
            }
        } else {
            System.out.println("Set is null!");
        }
    }
}

