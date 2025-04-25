package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.service.FaultReportService;

@RestController
@CrossOrigin("http://localhost:3000")
public class FaultReportController {

    private final FaultReportService faultReportService;

    @Autowired
    public FaultReportController (FaultReportService faultReportService){
        this.faultReportService = faultReportService;
    }
}
