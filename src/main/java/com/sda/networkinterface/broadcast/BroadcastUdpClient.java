package com.sda.networkinterface.broadcast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BroadcastUdpClient {

    final static String INET_ADDR = "255.255.255.255";
    final static int PORT = 11222;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Program umożliwia wysyłanie wiadomości typu broadcast na " + INET_ADDR + ":" + PORT);
        String message = "";
        while (!message.equals("exit")) {
            System.out.print("Wprowadź wiadomość do wysłania: ");
            message = scanner.nextLine();
            System.out.println("Send: " + sendMessage(message));
        }
    }

    static boolean sendMessage(String message) throws UnknownHostException {
        InetAddress addr = InetAddress.getByName(INET_ADDR);
        try (DatagramSocket datagramSocket = new DatagramSocket()) {
            DatagramPacket datagramPacket = new DatagramPacket(message.getBytes(), message.getBytes().length, addr, PORT);
            datagramSocket.send(datagramPacket);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
