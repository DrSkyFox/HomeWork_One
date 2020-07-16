package com.homework;

import com.homework.first.Lessons1;

import java.math.BigDecimal;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {

        completeTask();


        System.out.println("\nTask 8.... Введите год ");
        taskEight(new Scanner(System.in).nextInt());


    }

    private static void completeTask() throws Exception {
        //this is task One (main)
        System.out.println("\nMain start \n");
        //call function tasktwo
        taskTwo();
        System.out.println("\nTask 3: ");

        //call function task three
        System.out.println(taskThree(2.0f, 3.0f, 4.0f, 2.0f));
        System.out.println(taskThree(2.0f, 3.0f, 4.0f, 0.0f));

        System.out.println("\nTask 4: ");

        //call function taskfour
        taskFour();

        System.out.println("\nTask 5: ");
        //call function taskFive

        taskFive((short) 15);
        taskFive((short) -15);

        System.out.println("\nTask 6: ");
        //call function taskSix
        System.out.println(taskSix((short) 20));
        System.out.println(taskSix((short) -255));

        System.out.println("\nTask 7.... Введите имя ");

        //Task 7 Call subMethod
        taskSeven();

    }



    private static void taskTwo() {

        Lessons1 lessons1 = new Lessons1((byte)0x02, (short) 2,3,4.5f,5.0,'s',true);
        System.out.println(lessons1);
    }

    private static float taskThree(float a, float b, float c, float d) {
//        a*(b + (c/d));
        return d !=0 ? a*(b + (c/d)): 0.0f;

    }

    private static void taskFour() throws Exception {
        Object obj= Lessons1.sum(Double.valueOf(5.0), Double.valueOf(10.0));
        between10and20(obj);
        obj= Lessons1.sum(Byte.valueOf((byte) 0x01), Byte.valueOf((byte) 0x05));
        between10and20(obj);
    }

    private static void between10and20(Object obj) {
        System.out.println("Type is : " + obj.getClass() + " " + obj.toString());
        boolean bl = false;
        if ((obj instanceof Number)) {
            Number number_inter = new BigDecimal(obj.toString());
            Number number1 = new BigDecimal("10");
            Number number2 = new BigDecimal("20");
            if( (number_inter.doubleValue() <= number2.doubleValue()) && (number_inter.doubleValue() >= number1.doubleValue())) {
                bl = true;
            }
            System.out.println("Число " + number_inter.toString() + " лежит ли между 10 и 20 ? : " + bl);
        }
    }

    private static void taskFive(short num) {
        boolean numIsPositive = taskSix(num);
        if (numIsPositive) {
            System.out.println("Число " + num + " положительное");
        }
        else {
            System.out.println("Число " + num + " отрицательное");
        }
    }

    private static boolean taskSix(short num) {
        if (num < 0) {
            return false;
        } else if(num >= 0) {
            return true;
        }
        return false;
    }

    private static void taskSeven() {
        System.out.println("Приветсвую тебя злодейший из добрейших, " + new Scanner(System.in).nextLine() + "!");
    }


    private static void taskEight(int year) {
        //Каждый 4-й год является високосным
        if (year % 4 != 0) {
            System.out.println("Выполнено условие 1");
            System.out.println("Простой год");
        } else {
            // кроме каждого 100-го , при этом каждый 400-й – високосный. Проверка, что год делиться на 100 без остатка и если делится на 400, то високосный
            if ((year % 100 == 0) && (year % 400 != 0)) {
                System.out.println("Простой год");
                System.out.println("Выполнено условие 2");
            }
            else {
                System.out.println("Високосный год");
                System.out.println("НЕ выполнено условие 2");
            }
        }
    }




}
