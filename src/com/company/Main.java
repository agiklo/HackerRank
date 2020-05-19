package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	javaEndOfFile();
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
}
