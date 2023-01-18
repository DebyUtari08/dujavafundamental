package com.juaracoding.dujavafundamental.coba_coba;/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author LENOVO a.k.a. Deby Utari
Java Developer
Created on 18/01/2023 21.14
@Last Modified 18/01/2023 21.14
Version 1.0
*/

public class SuperClassX {
    private String strX ;
    private String strY ;
    private String strZ ;
    private String strW;
    private String strS ;
    private String strP ;


    public String getStrP() {
        return strP;
    }

    public void setStrP(String strP) {
        this.strP = strP;
    }

    public String getStrS() {
        return strS;
    }

    public void setStrS(String strS) {
        this.strS = strS;
    }

    public String getStrW() {
        return strW;
    }

    public void setStrW(String strW) {
        this.strW = strW;
    }

    public SuperClassX()
    {
        this.strS = "1022333";
    }

    public SuperClassX(String x,String y,String z) {
        this.strX = x;
        this.strY = y;
        this.strZ = z;
    }

    String xFunction(String paramA)
    {
        strX = paramA;

        return strX;
    }

    public float passingValue(float x)
    {
        return 5f*x;
    }

    String printAku()
    {
        return "AKU SUDAH TERPRINT !!";
    }
}



   