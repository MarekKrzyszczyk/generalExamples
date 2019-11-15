package com.sda.datetime.ex06;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        ZoneId id = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneOffset.UTC);
        ZonedDateTime tokyoZone = zonedDateTime.withZoneSameInstant(id);
        LocalDateTime tokyoZoned = tokyoZone.toLocalDateTime();

        System.out.println(tokyoZoned);
    }
}
