package ru.aston.hometask_3;

import java.time.LocalDate;

public class PrepareReport implements ReportStrategy{
    private ReportStrategy reportStrategy;

    public PrepareReport(ReportStrategy reportStrategy) {
        this.reportStrategy = reportStrategy;
    }

    public void setReportStrategy(ReportStrategy reportStrategy) {
        this.reportStrategy = reportStrategy;
    }

    @Override
    public String createReport(LocalDate localDate) {
        return reportStrategy.createReport(localDate);
    }

}
