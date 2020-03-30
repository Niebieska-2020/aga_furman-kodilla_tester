package com.kodilla.basic_assertion;

import java.util.Scanner;

public class Calculator<n, a, b> {
    int a;
    int n;

    Scanner in = new Scanner(System.in);

    public Calculator() {
        a = in.nextInt();
        n = in.nextInt(2);
    }

    public int sum(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int power(int a, int n) {
        return (int)Math.pow(a, n);
    }
}
