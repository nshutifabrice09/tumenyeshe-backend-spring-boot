package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.model.StatusHistory;
import rw.tumenyeshe.service.StatusHistoryService;

@RestController
@CrossOrigin("http://localhost:3000")
public class StatusHistoryController {

    private final StatusHistoryService statusHistoryService;

    @Autowired
    public StatusHistoryController (StatusHistoryService statusHistoryService){
        this.statusHistoryService = statusHistoryService;
    }

    @PostMapping("/statusHistory")
    public StatusHistory saveStatusHistory (@RequestBody StatusHistory statusHistory){
        return statusHistoryService.saveStatusHistory(statusHistory);
    }

}
