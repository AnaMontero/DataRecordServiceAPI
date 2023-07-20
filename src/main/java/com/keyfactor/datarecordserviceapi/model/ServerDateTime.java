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
}
