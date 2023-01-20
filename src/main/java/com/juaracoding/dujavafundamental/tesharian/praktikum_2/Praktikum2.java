package com.juaracoding.dujavafundamental.tesharian.praktikum_2;/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author LENOVO a.k.a. Deby Utari
Java Developer
Created on 19/01/2023 12.50
@Last Modified 19/01/2023 12.50
Version 1.0
*/

//import  java.lang.*;
import java.util.Scanner;

public class Praktikum2 {
    /*
	Soal Nomor 1 Praktikum 2 Java Fundamental
    */
    public static void main(String[] args) {

        //deklarasi dan inisialisasi
        //deklarasi dan inisialisasi
        Scanner sc = new Scanner(System.in);
        int intNumber = 0;
        float rata, total= 0.0F;
        int i= 0;
        boolean isAgain = true;


        try {
            System.out.println("Masukkan angka sepuasnya: ");


            do {
                intNumber = sc.nextInt();//input
                total += intNumber;//proses penjumlahan input
                i++;

            } while (isAgain); //kondisi


        } catch (Exception e) {//exception handling utk input karakter

            rata = total/i;
            System.out.println("Jumlah : " + total);//output
            System.out.println("Rata-rata yang dihasilkan :" +rata);
            System.exit(0);//keluar dari sistem
        }
    }
}
