package ru.aston.hometask_3;

import java.time.LocalDate;
import java.util.HashMap;

public class ProxyWeeklyReport implements ReportStrategy{

    private WeeklyReport weeklyReport;
    private static HashMap<LocalDate, String> cache = new HashMap<>();

    public ProxyWeeklyReport(WeeklyReport weeklyReport) {
        this.weeklyReport = weeklyReport;
    }

    @Override
    public String createReport(LocalDate localDate) {
        if (cache.get(localDate) == null){
            String report = weeklyReport.createReport(localDate);
            cache.put(localDate, report);
            return report;
        }
        return cache.get(localDate);
    }
}
