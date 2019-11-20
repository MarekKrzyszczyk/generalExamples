package com.sda.io.ex08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scan.nextInt();

        String fileName = "liczbyLosowe";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Marek Krzyszczyk\\Desktop\\" + fileName + ".txt"));

        int i = 0;
        while (i < number) {
            bufferedWriter.write(String.valueOf(random.nextInt(9))+"\n");
            i++;
        }

        bufferedWriter.close();

    }
}
