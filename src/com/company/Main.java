package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//javaEndOfFile();
	javaIntToString();
    }

    public static void javaEndOfFile(){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()){
            System.out.println( i + " " + sc.nextLine());
            i++;
        }
        sc.close();
    }

    public static void javaIntToString(){
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
}
