package com.juaracoding.dujavafundamental.tesharian.praktikum_1;/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author LENOVO a.k.a. Deby Utari
Java Developer
Created on 16/01/2023 11.23
@Last Modified 16/01/2023 11.23
Version 1.0
*/

import java.util.Scanner;

public class Kelas_Praktikum1 {

    public static void main(String[] args)
    {
        char chX = 'U';
        int intX = chX;
        System.out.println(intX);
        Scanner scanner = new Scanner(System.in);
        String strx = scanner.nextLine();
        System.out.println("NILAI STRX ADALAH : "+strx);

        int intTampung = 0;

        for (int i=0;i<strx.length();i++){
            chX = strx.charAt(i);
            intX = chX;
            if (intX>=32 && intX<=90){
//            if ((intX>=48 && intX<=57) || (intX>=65 && intX<=90) || (intX>=97 && intX<=122)){
//            if ((intX>=97 && intX<=122)){
                intTampung = intTampung + intX;
                System.out.println("INDEX KE "+i+" HURUF "+chX+" KODE ASCII "+intX);

            }


        }
        System.out.println("NILAI INT TAMPUNG ADALAH :"+intTampung);

//        System.out.println(64>=65);
//        System.out.println(64<=90)
    }
}


   