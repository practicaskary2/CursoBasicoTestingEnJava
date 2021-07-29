package com.kary.javatests.util;

public class DateUtil {

    //Verificar si un año es bisiesto
    public static boolean isLeap(int year){

        //Esto es un if simplificado
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
