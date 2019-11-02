package com.sda.networkinterface.broadcast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class BroadcastUdpServer {

    final static int PORT = 11222;

    public static void main(String[] args) throws UnknownHostException {

        byte[] buf = new byte[256];
        try (MulticastSocket clientSocket = new MulticastSocket(PORT)) {
            System.out.println("Serwer nasłuchuje w trybie broadcast");
            while (true) {
                DatagramPacket msgPacket = new DatagramPacket(buf, buf.length);
                clientSocket.receive(msgPacket);
                String msg = new String(buf, 0, msgPacket.getLength());
                System.out.println("server recieved msg: " + msg);
                if (msg.equals("end")) {
                    System.out.println("Server closing...");
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
