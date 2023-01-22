package com.juaracoding.dujavafundamental.tesharian.praktikum_3;/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author LENOVO a.k.a. Deby Utari
Java Developer
Created on 20/01/2023 13.36
@Last Modified 20/01/2023 13.36
Version 1.0
*/

import java.util.Scanner;

public class Praktikum3 {
  /*
	Soal Nomor 1 Praktikum 3 Java Fundamental
  */
    public static void main (String [] args) {
    Scanner input = new Scanner(System.in);

    int menit=0, detik= 0;
    System.out.println("Masukkan Jumlah Detik yang diinginkan : ");

    int konversi = 0;
    konversi=input.nextInt();

    detik= (konversi%3600)%60;
    menit= (konversi%3600)/60;

    System.out.println("Inputan dari "+konversi+" detik sama dengan "+menit+ "menit "+detik+ "detik");
    }
}


   