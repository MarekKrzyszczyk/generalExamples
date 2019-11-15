package com.sda.generics.ex04;

public class SmsMessage extends Message {
    @Override
    void sendMessage() {
        System.out.println("wysyłam sms");
    }
}
