package ru.aston.hometask_3;

import java.time.LocalDate;

public class ShortDailyReportAdapter implements ShortReport{

    private DailyReport dailyReport;

    public ShortDailyReportAdapter(DailyReport dailyReport) {
        this.dailyReport = dailyReport;
    }

    @Override
    public String getShortReport(LocalDate localDate) {

        System.out.println("Укороченный ежедневный отчет");
        return dailyReport.createReport(localDate).substring(0,9);
    }
}
