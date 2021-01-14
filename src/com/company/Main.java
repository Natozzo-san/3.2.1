package com.company;

import java.io.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        char ch1, ch2;
        int c;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        try {
            File file1 = new File("file1.txt");
            FileInputStream in1 =  new FileInputStream("file1.txt");
            File file2 = new File("file2.txt");
            FileInputStream in2 =  new FileInputStream("file2.txt");
            if (file1.length()>=file2.length()){
                FileInputStream in = new FileInputStream(file1);
                while((c = in.read())!= -1){
                    ch1 = (char) in1.read();
                    ch2 = (char) in2.read();
                    if (ch1!=ch2){
                        System.out.println(ch1+" "+ch2);
                    }
                }
            }
            if (file1.length()<file2.length()){
                FileInputStream in = new FileInputStream(file2);
                while((c = in.read())!= -1){
                    ch1 = (char) in1.read();
                    ch2 = (char) in2.read();
                    if (ch1!=ch2){
                        System.out.println(ch1+" "+ch2);
                    }
                }
            }
        }
        catch(Exception e) {
            System.err.println("Что то пошло не так!");
        }
        System.out.println("Различия: "+count);
    }
}