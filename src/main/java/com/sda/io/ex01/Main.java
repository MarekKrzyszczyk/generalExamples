package com.sda.io.ex01;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tytul");
        String title = scan.nextLine();
        System.out.println("podaj tekst");
        String text = scan.nextLine();

        WriteToFileBufferWriter writer = new WriteToFileBufferWriter();
        try{
            writer.writeFile(title,text);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
