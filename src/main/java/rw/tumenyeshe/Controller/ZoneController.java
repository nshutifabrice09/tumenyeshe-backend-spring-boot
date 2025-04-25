package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.Zone;
import rw.tumenyeshe.service.ZoneService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class ZoneController {

    private final ZoneService zoneService;

    @Autowired
    public ZoneController(ZoneService zoneService){
        this.zoneService = zoneService;
    }

    @PostMapping("/zone")
    public Zone saveZone(@RequestBody Zone zone){
        return zoneService.saveZone(zone);
    }

    @GetMapping("/zones")
    public List<Zone> zoneList(){
        return zoneService.getAllZone();
    }

    @GetMapping("/zone/{id}")
    public Zone findById (@PathVariable ("id")UUID id){
        return zoneService.getZoneById(id);
    }

    @PutMapping("/update/zone/{id}")
    public Zone updateZone(@PathVariable ("id") UUID id, @RequestBody Zone zone){
        return zoneService.updateZone(id, zone);
    }

    @DeleteMapping("/delete/zone/{id}")
    public void deleteById(@PathVariable("id")UUID id){
        zoneService.deleteById(id);
    }

}
