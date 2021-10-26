package com.company;

public class Main {

    public static void main(String[] args) {
        PrimesGenerator primesGenerator = new PrimesGenerator();
        PrimesGeneratorTest prime = new PrimesGeneratorTest();
        Integer[] array = primesGenerator.Generate(100);
        prime.soutArrayNormal(array);
        System.out.println();
        prime.soutArrayReverse(array);
    }
}

