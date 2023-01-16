package com.juaracoding.dujavafundamental.tesharian.praktikum_1;/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author LENOVO a.k.a. Deby Utari
Java Developer
Created on 15/01/2023 14.19
@Last Modified 15/01/2023 14.19
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        String strInput = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Data :" +strInput);
        strInput = sc.nextLine();



        char chx = 'I';
        int intx = chx;
        System.out.println(intx);

        int intJumlah = 0;
        for (int i=0; i<strInput.length(); i++) {
            chx = strInput.charAt(i);
            intx = chx;
            if (intx >= 32 && intx <= 90)
                //if ((intx >= 48 && intx <= 57) || (intx >= 65 && intx <= 90)
                      //  || (intx >= 97 && <= 122)){
                   // if ((intx >= 97 && <= 122))
                    {
                        intJumlah = intJumlah + intx;
                    }

                    System.out.println("INDEK KE"+i+" ADALAH HURUF "+chx+" KodeAscii "+ intx);

                }

        System.out.println("Nilai INTX:"+intJumlah);
    }
}



   