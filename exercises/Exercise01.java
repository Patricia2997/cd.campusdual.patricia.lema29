package com.campusdual.exercises;

import java.sql.SQLOutput;

public class Exercise01 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String cnv = "200";
        int cnvInt = Integer.parseInt(cnv);
        cnv = cnv + 1;
        cnvInt = cnvInt + 1;
        String cnvStr = String.valueOf(cnvInt);
        char cnvChar = cnvStr.charAt(2);
        int i = 1;
        String iStr = String.valueOf(i);
        Double iDouble = Double.valueOf(iStr);
        String iDStr = String.valueOf(iDouble);
        System.out.println(Boolean.valueOf("true"));
        System.out.println(String.valueOf("false"));
    }

}




