package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.model.ReportComment;
import rw.tumenyeshe.service.ReportCommentService;

@RestController
@CrossOrigin("http://localhost:3000")
public class ReportCommentController {

    private final ReportCommentService reportCommentService;

    @Autowired

    public ReportCommentController (ReportCommentService reportCommentService){
        this.reportCommentService = reportCommentService;
    }

    @PostMapping("/reportComment")
    public ReportComment saveReportComment(@RequestBody ReportComment reportComment){
        return reportCommentService.saveReportComment(reportComment);
    }
}
