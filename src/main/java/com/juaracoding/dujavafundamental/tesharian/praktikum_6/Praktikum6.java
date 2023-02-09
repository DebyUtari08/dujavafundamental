package com.juaracoding.dujavafundamental.tesharian.praktikum_6;/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author LENOVO a.k.a. Deby Utari
Java Developer
Created on 09/02/2023 13.03
@Last Modified 09/02/2023 13.03
Version 1.0
*/
import java.util.*;
import  java.lang.Math;

public class Praktikum6 {
    /*
	Soal Nomor 1 Praktikum 6 Java Fundamental
    */
    public static void main(String[] args) {

        ArrayList<Integer> nilai = new ArrayList();
        Scanner Input = new Scanner(System.in);

        System.out.print("Input Panjang Array:");
        int panjang = Input.nextInt();
        for (int i = 0; i < panjang; i++) {
            System.out.print("Index ke " + i + ":");
            int angka = Input.nextInt();
            nilai.add(angka);
        }


        System.out.println("Inputan Bilangan Bulat Sebelum di Sorting :" + nilai + "");
        for (int i = 0; i < nilai.size(); i++) {
            for (int j = 0; j < nilai.size() - 1; j++) {
                if (nilai.get(j) > nilai.get(j + 1)) {
                    int temp = nilai.get(j);
                    nilai.set(j, nilai.get(j + 1));
                    nilai.set(j + 1, temp);
                }
            }
        }
        String lagi= "Y";
        while (lagi.equals("Y"));
        Scanner yesno = new Scanner(System.in);
        System.out.println("Setelah di Sorting :" + nilai + "");
        System.out.println("Apakah Ingin Menyorting lagi? (Y/N)");lagi = yesno.nextLine().toUpperCase();
    }
}



   