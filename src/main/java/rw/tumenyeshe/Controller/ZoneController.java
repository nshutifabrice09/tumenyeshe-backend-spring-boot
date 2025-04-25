package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.model.Zone;
import rw.tumenyeshe.service.ZoneService;

@RestController
@CrossOrigin("http://localhost:3000")
public class ZoneController {

    private final ZoneService zoneService;

    @Autowired
    public ZoneController(ZoneService zoneService){
        this.zoneService = zoneService;
    }
}
