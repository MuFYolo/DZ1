package ru.aston.hometask_3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DailyReport dailyReport = new DailyReport();
        WeeklyReport weeklyReport = new WeeklyReport();
        SendReport sendReportToEmail = new SendReportToEmail();
        SendReport sendReportToCloud = new SendReportToCloud(sendReportToEmail);
        sendReport(sendReportToCloud, dailyReport, LocalDate.now());

        ShortDailyReportAdapter adapter = new ShortDailyReportAdapter(dailyReport);
        System.out.println(adapter.getShortReport(LocalDate.now()));
    }

    private static void sendReport(SendReport sendReport, ReportStrategy reportStrategy, LocalDate localDate) {
        sendReport.send(reportStrategy, localDate);
    }

}
