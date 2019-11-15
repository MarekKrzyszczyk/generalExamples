package com.sda.generics.ex04;

public class EmailSender implements MessageSend{

    @Override
    public void sendMessage(Message message) {
        message.sendMessage();
    }
}
