package com.slavacom.task5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Character> j = new HashSet<>();
        for (char c : scanner.nextLine().toCharArray()) {
            j.add(c);
        }

        int count = 0;

        for (char c : scanner.nextLine().toCharArray()) {
            if (j.contains(c)) count++;
        }

        System.out.println(count);
    }
}
