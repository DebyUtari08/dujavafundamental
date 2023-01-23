package com.juaracoding.dujavafundamental.basic_program;/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author LENOVO a.k.a. Deby Utari
Java Developer
Created on 23/01/2023 19.41
@Last Modified 23/01/2023 19.41
Version 1.0
*/

public class ImplicitCasting {
    public static void main (String[]args){
        short dataFirst = 457;
        double doubleData= dataFirst;
        char dataSecond = 'W';
        long longData= dataSecond;
        int dataThird = 456;
        float floatData = dataThird;
        byte dataFourth = 127;
        long longDataSecond = dataFourth;
        float dataFifth = 565;
        double doubleDataSecond = dataFifth;
    System.out.println("Short ke Double" +doubleData);
    System.out.println("Char ke Long" +longData);
    System.out.println("Int ke Float" +floatData);
    System.out.println("Byte ke Long" +longDataSecond);
    System.out.println("Float ke Double" +doubleDataSecond);
    }
}


   