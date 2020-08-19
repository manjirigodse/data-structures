package com.vortex.learningjava.datastructures.arrayoperations1;

public class DiagonalPrinting {

    public void printDiagonally(int [][] matrix, int m, int n){

        for(int k = 0; k <= m-1; k++){
           int i = k;
           int j = 0;

           while(i >= 0 && j<= n-1){
               System.out.print(matrix[i][j] + " ");
               i--;
               j++;
           }
            System.out.println();
        }

        for(int k = 1; k <= n-1; k++){
            int i = m-1;
            int j = k;

            while(i >= 0 && j<= n-1){
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
        }
    }
}
