package com.sda.optional.ex02;

import java.util.Scanner;

public class ScannerString {

    public static String getStringFromScanner(){
        System.out.println("Podaj text: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

}
