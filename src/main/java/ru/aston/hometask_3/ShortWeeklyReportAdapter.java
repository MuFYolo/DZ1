package ru.aston.hometask_3;

import java.time.LocalDate;

public class ShortWeeklyReportAdapter implements ShortReport{

    private WeeklyReport weeklyReport;

    public ShortWeeklyReportAdapter(WeeklyReport weeklyReport) {
        this.weeklyReport = weeklyReport;
    }

    @Override
    public String getShortReport(LocalDate localDate) {
        System.out.println("Укороченный еженедльный отчет");
        return weeklyReport.createReport(localDate).substring(0,9);
    }
}
