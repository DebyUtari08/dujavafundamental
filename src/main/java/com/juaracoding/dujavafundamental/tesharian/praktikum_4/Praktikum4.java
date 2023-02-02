package com.juaracoding.dujavafundamental.tesharian.praktikum_4;/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author LENOVO a.k.a. Deby Utari
Java Developer
Created on 02/02/2023 12.58
@Last Modified 02/02/2023 12.58
Version 1.0
*/

import java.util.Scanner;

public class Praktikum4 {
    /*
	Soal Nomor 2 Praktikum 4 Java Fundamental
    */
    private static Scanner sc = new Scanner(System.in);

    private static int input_menu;
    private static double luas;

    public static void main(String[] args) {
        System.out.println("===== Menghitung Luas ====");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Persegi");
        System.out.println("4. Segitiga");
        System.out.println("5. Belah Ketupat");

        System.out.print("- Masukkan angka = ");
        input_menu = sc.nextInt();

        switch (input_menu) {
            case 1:
                hitung_lingkaran();
                break;
            case 2:
                hitung_persegipjg();
                break;
            case 3:
                hitung_persegi();
                break;
            case 4:
                hitung_segitiga();
                break;
            case 5:
                hitung_belahketupat();
                break;

            default:
                System.out.println("Menu tidak ada");
                break;
        }
    }

    private static double hitung_tinggisegitiga(double sisi_miring, double sisi_alas) {
        double result = Math.sqrt(Math.pow(sisi_miring, 2) - Math.pow(sisi_alas, 2));
        return result;
    }

    private static void output_hasil(double luas) {
        System.out.println("* Luas = " + luas);
        System.out.println("---------------------");
    }

    private static void hitung_lingkaran() {
        double luas = 0, phi = 3.14;
        int r = 0;

        System.out.println("\n\n---- 1. lingkaran ----");
        System.out.print("- Masukkan Jari-Jari = ");
        r = sc.nextInt();

        luas = phi * r * r;

        output_hasil(luas);
    }

    private static void hitung_persegipjg() {
        double panjang= 0, lebar=0;

        System.out.println("\n\n---- 2. Persegi Panjang ----");
        System.out.print("- Masukkan Panjang = ");
        panjang = sc.nextDouble();
        System.out.print("- Masukkan Lebar = ");
        lebar = sc.nextDouble();

        luas = panjang * lebar;

        output_hasil(luas);
    }

    private static void hitung_persegi() {
        double panjang_sisi=0;

        System.out.println("\n\n---- 3. Persegi ----");
        System.out.print("- Masukkan Panjang sisi = ");
        panjang_sisi = sc.nextDouble();

        luas = Math.pow(panjang_sisi, 2);

        output_hasil(luas);

    }

    private static void hitung_segitiga() {
        double panjang_sisi=0, tinggi=0;

        System.out.println("\n\n---- 4. Segitiga ----");
        System.out.print("- Masukkan Panjang Sisi = ");
        panjang_sisi = sc.nextDouble();
        System.out.println("_Masukkan Tinggi =");
        tinggi= sc.nextDouble();

        luas = 0.5 * panjang_sisi * tinggi;

        output_hasil(luas);

    }

    private static void hitung_belahketupat() {
        double luas = 0, d1 = 0, d2 = 0;

        System.out.println("\n\n---- 5. Belah Ketupat ----");
        System.out.print("- Masukkan Diagonal 1 = ");
        d1 = sc.nextDouble();
        System.out.print("- Masukkan Diagonal 2 = ");
        d2 = sc.nextDouble();

        luas = 0.5 * d1 * d2;

        output_hasil(luas);
    }
}



