package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.model.AdminActingLog;
import rw.tumenyeshe.service.AdminActingLogService;

@RestController
@CrossOrigin("http://localhost:3000")
public class AdminActingLogController {

    private final AdminActingLogService adminActingLogService;

    @Autowired
    public AdminActingLogController (AdminActingLogService adminActingLogService){
        this.adminActingLogService = adminActingLogService;
    }

    @PostMapping("/adminactinglog")
    public AdminActingLog save(@RequestBody AdminActingLog adminActingLog){
        return adminActingLogService.saveAdminActingLog(adminActingLog);
    }
    
}
