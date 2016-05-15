package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\gregory\\IdeaProjects\\SimpleProblemsPractice\\resources\\stringsToReverse.txt");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
               reverseString(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void reverseString(String s){
        int end = s.length() - 1;
        int begin = 0;
        char[] arr = s.toCharArray();


        while (begin < end) {
            swap(arr, begin, end);
            begin ++;
            end --;
        }



        String returnStr = new String(arr);
        System.out.println(returnStr);

    }
    public static void swap(char[] arr, int begin, int end){
        char temp = arr[end];
        arr[end] = arr[begin];
        arr[begin] = temp;

    }
}
