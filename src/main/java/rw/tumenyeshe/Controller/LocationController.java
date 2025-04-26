package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.Location;
import rw.tumenyeshe.service.LocationService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class LocationController {

    private final LocationService locationService;

    @Autowired
    public LocationController (LocationService locationService){
        this.locationService = locationService;
    }

    @PostMapping("/location")
    public Location saveLocation(@RequestBody Location location){
        return locationService.saveLocation(location);
    }

    @GetMapping("/locations")
    public List<Location> locationList(){
        return locationService.getAllLocation();
    }

    @GetMapping("/location/{id}")
    public Location findById(@PathVariable ("id")UUID id){
        return locationService.getLocationById(id);
    }

    @GetMapping("/update/location/{id}")
    public Location updateLocation(@PathVariable ("id") UUID id, @RequestBody Location location){
        return locationService.updateLocation(id, location);
    }

    @DeleteMapping("/delete/location/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        locationService.deleteById(id);
    }

}
