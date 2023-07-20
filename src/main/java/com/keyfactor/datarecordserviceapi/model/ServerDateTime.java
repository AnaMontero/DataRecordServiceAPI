package com.keyfactor.datarecordserviceapi.model;

import java.time.LocalDate;

public class ServerDateTime {
    private final LocalDate dateTime;

    private ServerDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public static ServerDateTime getCurrentTime() {
        return new ServerDateTime(LocalDate.now());
    }

    public static ServerDateTime getMinValue() {
        return new ServerDateTime(LocalDate.MIN);
    }

    public static ServerDateTime addMilliseconds(ServerDateTime source, int millis){
        return source;
    }

    public static ServerDateTime toServerDateTime(LocalDate localDate) {
        return new ServerDateTime(localDate);
    }

    public boolean isBefore(ServerDateTime other) {
        return this.dateTime.compareTo(other.dateTime) < 0;
    }

    public boolean isAfter(ServerDateTime other) {
        return this.dateTime.compareTo(other.dateTime) > 0;
    }
}
