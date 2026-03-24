package com.calculadora;

//Taller de conflictos
public class Calculadora {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;

        System.out.println("---Calculadora---");
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Suma: " + (a + b));
    }

    public static int multi(int a, int b) {
        return a * b;
    }
}
