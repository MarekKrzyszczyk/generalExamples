package com.sda.generics.ex04;

public class Main {
    public static void main(String[] args) {
        MessageSend emailSender = new EmailSender();
        MessageSend smsSender = new SmsSender();
        emailSender.sendMessage(new EmailMessage());
        smsSender.sendMessage(new SmsMessage());
    }
}
