package com.juaracoding.dujavafundamental.tesharian.praktikum_5;/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author LENOVO a.k.a. Deby Utari
Java Developer
Created on 06/02/2023 17.10
@Last Modified 06/02/2023 17.10
Version 1.0
*/

import java.util.Scanner;

public class Praktikum5 {
    /*
	Soal Nomor 2 Praktikum 5 Java Fundamental
    */

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("Program Percabangan Bersarang Segitiga Siku-Siku");
        System.out.println("=========================================");
        System.out.println("");

        int tinggi = 0, i = 0, j = 0, jarak = 0;

        System.out.println("Masukkan Inputan Tinggi Segitiga Siku-Siku:");
        tinggi = inputan.nextInt();
        System.out.println();
        jarak = tinggi - i;
        for (i = 1; i <= jarak; i++) {

            for (j = 1; j <= tinggi; j++) {
                System.out.print(" ");
            }
            for (j = 1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}


   