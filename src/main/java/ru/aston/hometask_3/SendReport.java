package ru.aston.hometask_3;

import java.time.LocalDate;

public interface SendReport {
    void send(ReportStrategy reportStrategy, LocalDate localDate);
}
