package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.model.ReportAnalytics;
import rw.tumenyeshe.service.ReportAnalyticsService;

@RestController
@CrossOrigin("http://localhost:3000")
public class ReportAnalyticsController {

    private final ReportAnalyticsService reportAnalyticsService;

    @Autowired
    public ReportAnalyticsController (ReportAnalyticsService reportAnalyticsService){
        this.reportAnalyticsService = reportAnalyticsService;
    }

    @PostMapping("/reportAnalytics")
    public ReportAnalytics saveReportAnalytics (@RequestBody ReportAnalytics reportAnalytics){
        return reportAnalyticsService.saveReportAnalytics(reportAnalytics);
    }
}
