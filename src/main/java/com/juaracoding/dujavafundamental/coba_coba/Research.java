package com.juaracoding.dujavafundamental.coba_coba;/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author LENOVO a.k.a. Deby Utari
Java Developer
Created on 17/01/2023 15.51
@Last Modified 17/01/2023 15.51
Version 1.0
*/

public class Research {
    public static void main ( String args []) {
        int intLoop = 0;
        for (int i=0 ; i<10 ; i++ ) {
            intLoop++;
            for ( int j=0; j<20; j++) {
                if (j==0) {
                    break ;
                }
                intLoop ++;
            }
        }
                System.out.println(intLoop);
    }
}


   