package io.github.pzmi.jsonlocaldatetime;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class SomethingWithDate {
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime dateTime;

    public SomethingWithDate() {
    }

    public SomethingWithDate(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
