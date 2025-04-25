package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.service.StatusHistoryService;

@RestController
@CrossOrigin("http://localhost:3000")
public class StatusHistoryController {

    private final StatusHistoryService statusHistoryService;

    @Autowired
    public StatusHistoryController (StatusHistoryService statusHistoryService){
        this.statusHistoryService = statusHistoryService;
    }
}
