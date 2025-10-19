package ru.aston.hometask_3;

import java.time.LocalDate;

public class DailyReport implements ReportStrategy {

    String order1;
    String order2;
    String order3;
    String order4;

    @Override
    public String createReport(LocalDate localDate) {
        DailyReport dailyReport = new DailyReport.Builder()
                .order1("Продажа 1 ")
                .order2("Продажа 2 ")
                .order3("Продажа 3 ")
                .order4("Продажа 4 ")
                .build();
        return  dailyReport.order1 + dailyReport.order1 + dailyReport.order1 + dailyReport.order1 + localDate;
    }

    public static class Builder {
        private final DailyReport dailyReport;

        Builder() {
            dailyReport = new DailyReport();
        }

        public Builder order1(String order1) {
            dailyReport.order1 = order1;
            return this;
        }

        public Builder order2(String order2) {
            dailyReport.order2 = order2;
            return this;
        }

        public Builder order3(String order3) {
            dailyReport.order3 = order3;
            return this;
        }

        public Builder order4(String order4) {
            dailyReport.order4 = order4;
            return this;
        }

        public DailyReport build() {
            return dailyReport;
        }
    }
}
