package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.AdminActingLog;
import rw.tumenyeshe.service.AdminActingLogService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class AdminActingLogController {

    private final AdminActingLogService adminActingLogService;

    @Autowired
    public AdminActingLogController (AdminActingLogService adminActingLogService){
        this.adminActingLogService = adminActingLogService;
    }

    @PostMapping("/adminActingLog")
    public AdminActingLog save(@RequestBody AdminActingLog adminActingLog){
        return adminActingLogService.saveAdminActingLog(adminActingLog);
    }
    @GetMapping("/adminActingLogs")
    public List <AdminActingLog> adminActingLogsList(){
        return adminActingLogService.getAllAdminActingLogs();
    }
    @GetMapping("/adminActingLog/{id}")
    public AdminActingLog findById (@PathVariable ("id")UUID id){
        return adminActingLogService.getAdminActingLogById(id);
    }

    @PutMapping("/update/adminActingLog/{id}")
    public AdminActingLog updateAdminActingLog(@PathVariable ("id")UUID id, @RequestBody AdminActingLog adminActingLog){
        return adminActingLogService.updateAdminActingLog(id, adminActingLog);
    }

    @DeleteMapping("/delete/adminActingLog/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        adminActingLogService.deleteById(id);
    }
}
