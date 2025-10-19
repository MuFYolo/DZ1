package ru.aston.hometask_3;

import java.time.LocalDate;

public class SendReportToCloud implements SendReport{
    private SendReport sendReport;

    public SendReportToCloud() {
    }

    public SendReportToCloud(SendReport sendReport) {
        this.sendReport = sendReport;
    }

    @Override
    public void send(ReportStrategy reportStrategy, LocalDate localDate) {
        if (sendReport != null) {
            reportStrategy.createReport(localDate);
            sendReport.send(reportStrategy, localDate);
        }
        System.out.println("Отчет отправлен в облако");
    }
}
