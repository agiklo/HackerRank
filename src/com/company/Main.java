package com.company;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static void javaEndOfFile() {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
        sc.close();
    }

    public static void javaIntToString() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String s = Integer.toString(n);
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
    public static void stringsIntroduction(){
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        if (A.length() > B.length()) System.out.println("No");
        else System.out.println("Yes");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));

    }
}