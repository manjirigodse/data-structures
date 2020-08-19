package com.vortex.learningjava.datastructures.codingproblems1;

public class PrimeNumber {
    public static void main(String[] args) {
        long i=1;
        long x = 5915587277L;
        long startTime = System.currentTimeMillis();
        boolean isPrime = true;
        long n = (long) Math.sqrt(x);

        if(x == 1 || x == 2 || x == 3){
            isPrime = true;
        }else if(x % 2 == 0 || x % 3 == 0){
            isPrime = false;
        }else {
            while( 6*i <= n){
                System.out.print(" " +i);
                if(x % (6*i-1) == 0){
                    isPrime = false;
                    break;
                }else if(x % (6*i+1) == 0){
                    isPrime = false;
                    break;
                }
                i++ ;
            }
        }
        printStatus(isPrime);
        System.out.println("Time Taken: "+ (System.currentTimeMillis()-startTime) + "ms");
    }

    public static void printStatus(boolean isPrime){
        if (isPrime){
            System.out.println("\nPrime Number");
        } else {
            System.out.println("\nNot a Prime Number");
        }
    }
}
