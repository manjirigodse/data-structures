package com.vortex.learningjava.datastructures.codingproblems1;

public class StringPermute {

    static String s = "ab";
    static int n = s.length();
    static int a = 0;
    static int b = n-1;

    public static void main(String[] args) {
        permute(a, b);
        System.out.print(s + " ");
    }

    static void permute(int a, int b) {

        for (int i = a; i < b; i++) {

            s = swap(s, a, i+1);

            if (a < n - 2) {
                permute(a + 1, b);
            }

            System.out.print(s + " ");
            s = swap(s, a, i+1);

            if (i == b-1){
                permute(a + 1, b);
            }
        }
    }

    static String swap(String s, int i, int j) {

        String prefix = i > 0 ? s.substring(0, i) : "";
        String suffix = j < s.length()-1 ? s.substring(j + 1) : "";
        return (prefix + s.charAt(j) +s.substring(i+1,j)+ s.charAt(i) + suffix);
    }
}
