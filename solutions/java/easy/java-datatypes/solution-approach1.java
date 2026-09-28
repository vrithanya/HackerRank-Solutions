// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
// Problem     Java Datatypes
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-28, 11:11 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long n = sc.nextLong();

                System.out.println(n + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");

                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");

                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("* int");

                System.out.println("* long");

            } catch (Exception e) {
                String n = sc.next();
                System.out.println(n + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
