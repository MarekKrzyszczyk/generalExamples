package com.sda.generics.ex04;

@FunctionalInterface
public interface MessageSend <T extends Message>{
    void sendMessage(T t);
}
