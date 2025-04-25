package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.service.ReportAnalyticsService;

@RestController
@CrossOrigin("http://localhost:3000")
public class ReportAnalyticsController {

    private final ReportAnalyticsService reportAnalyticsService;

    @Autowired
    public ReportAnalyticsController (ReportAnalyticsService reportAnalyticsService){
        this.reportAnalyticsService = reportAnalyticsService;
    }
}
