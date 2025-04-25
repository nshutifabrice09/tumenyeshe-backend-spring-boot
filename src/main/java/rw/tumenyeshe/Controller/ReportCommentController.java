package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.service.ReportAnalyticsService;
import rw.tumenyeshe.service.ReportCommentService;

@RestController
@CrossOrigin("http://localhost:3000")
public class ReportCommentControll {

    private final ReportCommentService reportCommentService;

    @Autowired

    public ReportAnalyticsController (ReportCommentService reportCommentService){
        this.reportCommentService = reportCommentService;
    }
}
