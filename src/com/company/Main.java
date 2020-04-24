package com.company;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class Main {
    static double grade (int score){
        if (score>=80){
            return 4;
        }
        else if (score>=75){
            return 3.5;
        }
        else if (score>=70){
            return 3;
        }
        else if (score>=65){
            return 2.5;
        }
        else if (score>=60){
            return 2;
        }
        else if (score>=55){
            return 1.5;
        }
        else if (score>=50){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(grade(scan.nextInt()));
    }
}
