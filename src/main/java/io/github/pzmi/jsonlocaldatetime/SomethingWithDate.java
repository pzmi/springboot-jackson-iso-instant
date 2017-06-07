package io.github.pzmi.jsonlocaldatetime;

import java.time.Instant;

public class SomethingWithDate {
    private Instant dateTime;

    public SomethingWithDate() {
    }

    public SomethingWithDate(Instant dateTime) {
        this.dateTime = dateTime;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public void setDateTime(Instant dateTime) {
        this.dateTime = dateTime;
    }
}
