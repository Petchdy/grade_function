package com.company;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class Main {
    static void grade(int score){
        if (score>=80){
            System.out.printf("4");
        }
        else if (score>=75){
            System.out.printf("3.5");
        }
        else if (score>=70){
            System.out.printf("3");
        }
        else if (score>=65){
            System.out.printf("2.5");
        }
        else if (score>=60){
            System.out.printf("2");
        }
        else if (score>=55){
            System.out.printf("1.5");
        }
        else if (score>=50){
            System.out.printf("1");
        }
        else {
            System.out.printf("0");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        grade(scan.nextInt());
    }
}
