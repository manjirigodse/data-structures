package com.vortex.learningjava.datastructures.arrayoperations1;

public class Main {

    static int matrix[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
    static int m = 4;
    static int n = 5;

    public static void main(String[] args) {

        DiagonalPrinting diagonalPrinting = new DiagonalPrinting();

        diagonalPrinting.printDiagonally( matrix, m, n );

    }
}
