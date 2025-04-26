package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.model.IntegrationLog;
import rw.tumenyeshe.service.IntegrationLogService;

@RestController
@CrossOrigin("http://localhost:3000")
public class IntegrationLogController {

    private final IntegrationLogService integrationLogService;

    @Autowired
    public IntegrationLogController (IntegrationLogService integrationLogService){
        this.integrationLogService = integrationLogService;
    }
}
