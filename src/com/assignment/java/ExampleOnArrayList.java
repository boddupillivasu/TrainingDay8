package com.assignment.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExampleOnArrayList {
    public static void main(String[] args) {
        String[] array1 = {"Python","JAVA","PHP","C#","C++","SQL"};
        String[] array2 = {"MySQL","SQL","SQLite","Oracle","PostgreSQL","DB2","JAVA"};
        findCommonElements(array1,array2);
    }

    private static void findCommonElements(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (String element :array1) {
            set1.add(element);
        }
        for (String element :array2) {
            set2.add(element);
        }
        set1.retainAll(set2);
        System.out.println("common element:["+String.join(",",set1)+"]");
    }
}


