package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltinExceptions {
    public static void main(String[] args) {
//processArithmeticException();
// обработка исключения ввода
        //processInputMismatchExceptions();
       // IOException();
        //processArray();
        //processClass();
        processField();




    }


    static void processArithmeticException() {
        // Деление на ноль
        try {
            int a = 1, b;
            b = a / 0;
        } catch (ArithmeticException e) {
            System.err.println("Деление на ноль");
        }
    }

    public static void processInputMismatchExceptions() {
        int a = 0;


        while (a == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a:");

            try {
                a = scanner.nextInt();

            } catch (InputMismatchException e) {

                System.err.println("Error, enter an integer number");
                scanner.close();

            }
        }
    }

   public static void IOException(){
        try {
            InputStream input = new FileInputStream("src\\data\\words.txt");
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.err.println("File not found");
        }
        System.out.println("File opened...");

    }

    static  void processArray(){
        int[] a= {1,2,3};
        try{
        int b = a[3];}
        catch (ArrayIndexOutOfBoundsException e){
        System.err.println(" Выход за пределы масива");
    }
    }
    static  void processClass(){
        Class<?> clazz= null;
        try {
            clazz= Class.forName("com.company.Main");
        } catch (ClassNotFoundException e) {
            System.err.println();
        }
        System.out.println(clazz.getName());

    }

    static void processField(){
        Class<?> clazz= null;

            clazz= Person.class;
        try {
            Field field = clazz.getDeclaredField("name");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


    }
    }



