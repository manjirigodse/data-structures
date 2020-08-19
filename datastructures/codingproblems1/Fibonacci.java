package com.vortex.learningjava.datastructures.codingproblems1;

/**
 * Created by Ritz on 26/12/2018.
 */
public class Fibonacci {
    public static void main(String[] args) {
       withoutRecursion();
       withRecursion(0,1,10);
    }

    public static void withoutRecursion() {
        System.out.println("withoutRecursion");
        int a=0,b=1,n=10,c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i=1;i<n-1;i++){
            c=a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void withRecursion(int a,int b, int n) {
        if(a==0 && b==1){
            System.out.println("\nwithRecursion");
            System.out.print(a + " ");
            System.out.print(b + " ");
        }
        if(n>2){
            int c = a + b;
            System.out.print(c + " ");
            withRecursion(b, c, --n);
        }

    }
}
