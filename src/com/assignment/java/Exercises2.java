package com.assignment.java;
import  java.util.Scanner;
public class Exercises2 {

     public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a String:");
        String sa=obj.next();

        System.out.println("enter the number from which  index the word should be printed:");
        int ds=obj.nextInt();
        System.out.println("enter the number from which  index the word should be ended:");
        int ds1=obj.nextInt();
        if((ds<sa.length()-1)&&(ds1<=sa.length()-1))
        {
            System.out.println("after using substring method the word becoms:"+sa.substring(ds,ds1));
        }
        else
        {
            System.out.println();
        }



    }

}


