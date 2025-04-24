package rw.tumenyeshe.service;

import rw.tumenyeshe.model.Zone;

import java.util.List;
import java.util.UUID;

public interface ZoneService {
    List<Zone> getAllZone();
    Zone getZoneById(UUID id);
    Zone saveZone (Zone zone);
    Zone updateZone (UUID id);
    void deleteById (UUID id);
}
