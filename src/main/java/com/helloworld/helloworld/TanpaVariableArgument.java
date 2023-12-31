package com.helloworld.helloworld;

public class TanpaVariableArgument {
    public static void main(String[] args) {
        int[] values = { 30, 75, 30 };
        String name = "John Doe";
        main(name, values);
    }

    static void main(String name, int[] values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}