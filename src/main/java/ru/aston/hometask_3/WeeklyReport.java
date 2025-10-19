package ru.aston.hometask_3;

import java.time.LocalDate;

public class WeeklyReport implements ReportStrategy{

    String order1;
    String order2;
    String order3;
    String order4;

    @Override
    public String createReport(LocalDate localDate) {
        WeeklyReport weeklyReport = new WeeklyReport.Builder()
                .order1("Продажа 1 ")
                .order2("Продажа 2 ")
                .order3("Продажа 3 ")
                .order4("Продажа 4 ")
                .build();
        return  weeklyReport.order1 + weeklyReport.order1 + weeklyReport.order1 + weeklyReport.order1 + localDate;
    }

    public static class Builder {
        private final WeeklyReport weeklyReport;

        Builder() {
            weeklyReport = new WeeklyReport();
        }

        public WeeklyReport.Builder order1(String order1) {
            weeklyReport.order1 = order1;
            return this;
        }

        public WeeklyReport.Builder order2(String order2) {
            weeklyReport.order2 = order2;
            return this;
        }

        public WeeklyReport.Builder order3(String order3) {
            weeklyReport.order3 = order3;
            return this;
        }

        public WeeklyReport.Builder order4(String order4) {
            weeklyReport.order4 = order4;
            return this;
        }

        public WeeklyReport build(){
            return weeklyReport;
        }
    }
}
