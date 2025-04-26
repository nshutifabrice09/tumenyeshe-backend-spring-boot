package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.service.LocationService;

@RestController
@CrossOrigin("http://localhost:3000")
public class LocationController {

    private final LocationService locationService;

    @Autowired
    public LocationController (LocationService locationService){
        this.locationService = locationService;
    }
}
