package rw.tumenyeshe.service;

import rw.tumenyeshe.model.Location;

import java.util.List;
import java.util.UUID;

public interface LocationService {

    List<Location> getAllLocation();
    Location getLocationById(UUID id);
    Location saveLocation (Location location);
    Location updateLocation (UUID id, Location location);
    void deleteById (UUID id);
}
