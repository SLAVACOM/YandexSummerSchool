package com.slavacom.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2APlusB {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter writer = new PrintWriter(new File("output.txt"));

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        writer.println(A + B);

        scanner.close();
        writer.close();
    }
}