package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.IntegrationLog;
import rw.tumenyeshe.service.IntegrationLogService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class IntegrationLogController {

    private final IntegrationLogService integrationLogService;

    @Autowired
    public IntegrationLogController (IntegrationLogService integrationLogService){
        this.integrationLogService = integrationLogService;
    }

    @PostMapping("/integrationLog")
    public IntegrationLog saveIntegrationLog(@RequestBody IntegrationLog integrationLog){
        return integrationLogService.saveIntegrationLog(integrationLog);
    }

    @GetMapping("/integrationLogs")
    public List<IntegrationLog> integrationLogList(){
        return integrationLogService.getAllIntegrationLog();
    }

    @GetMapping("/integrationLogList/{id}")
    public IntegrationLog findById(@PathVariable ("id")UUID id){
        return integrationLogService.getIntegrationLogById(id);
    }

    @PutMapping("/update/integrationLog/{id}")
    public IntegrationLog updateIntegrationLog (@PathVariable ("id")UUID id, @RequestBody IntegrationLog integrationLog){
        return integrationLogService.updateIntegrationLog(id, integrationLog);
    }

    @DeleteMapping("/delete/integrationLog/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        integrationLogService.deleteById(id);
    }
}
