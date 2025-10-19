package ru.aston.hometask_3;

import java.time.LocalDate;
import java.util.HashMap;

public class ProxyDailyReport implements ReportStrategy{

    private DailyReport dailyReport;
    public static HashMap<LocalDate, String> cache = new HashMap<>();

    public ProxyDailyReport(DailyReport dailyReport) {
        this.dailyReport = dailyReport;
    }

    @Override
    public String createReport(LocalDate localDate) {
        if (cache.get(localDate) == null) {
            String report = dailyReport.createReport(localDate);
            cache.put(localDate, report);
            return report;
        }
        return cache.get(localDate);
    }
}
