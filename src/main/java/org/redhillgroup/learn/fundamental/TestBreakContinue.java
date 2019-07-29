package org.redhillgroup.learn.fundamental;

import java.util.Arrays;
import java.util.List;

public class TestBreakContinue {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 6, 7, 9, 1, 3, 4);
        List<String> words = Arrays.asList("books", "pen", "cup", "banana", "orange");
        for (Integer number : numbers) {
            //print odd numbers only
            if ((number % 2) == 0)
                continue;
            System.out.print(number + " ");
        }
        System.out.println();


        //Unlabelled break: Terminates the innermost switch, do, do-while or for statement.

        //search for word "banana"
        for (String word : words) {
            System.out.println(word);
            if (word.equals("banana")) {
                System.out.println("Found \"" + word + "\" at index " + words.indexOf(word) + "\nExiting search...");
                break;
            }
        }


        //Labelled continue statement: Terminates an outer statement
        System.out.println("Program argument supplied: " + args[0]);
        Integer[][] table = {{3, 4, 5,}, {10, 20, 30}, {100, 200, 300}};
        Integer searchTarget = Integer.valueOf(args[0]);
        boolean found = false;

        search:
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].equals(searchTarget)) {
                    found = true;
                    break search;
                }
            }
        }
        if (found) {
            System.out.println("Found it");
        } else {
            System.out.println("Not Found");
        }
    }
}

