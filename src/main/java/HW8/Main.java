package HW8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        printUniqueWords("масло, масло, колбаса, молоко");
    }

    public static void printUniqueWords(String stringExample) {
        String[] words = stringExample.replaceAll(" ", "").split(",");
        Set<String> mySet = new HashSet<>(Arrays.asList(words));
        for (String value : mySet) {
            System.out.println(value.substring(0, 1).toUpperCase() + value.substring(1));
        }
    }
}