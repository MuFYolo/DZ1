package ru.aston.hometask_3;

import java.time.LocalDate;

public class SendReportToEmail implements SendReport {
    private SendReport sendReport;

    public SendReportToEmail() {
    }

    public SendReportToEmail(SendReport sendReport) {
        this.sendReport = sendReport;
    }

    @Override
    public void send(ReportStrategy reportStrategy, LocalDate localDate) {
        if (sendReport != null) {
            sendReport.send(reportStrategy, localDate);
            reportStrategy.createReport(localDate);
        }
        System.out.println("Отчет отправлен на почту");

    }
}
