package rw.tumenyeshe.service;

import rw.tumenyeshe.model.OutageEvent;

import java.util.List;
import java.util.UUID;

public interface OutageEventService {

    List<OutageEvent> getAllOutageEvent();
    OutageEvent getOutageEventById(UUID id);
    OutageEvent saveOutageEvent (OutageEvent outageEvent);
    OutageEvent updateOutageEvent (UUID id, OutageEvent outageEvent);
    void deleteById (UUID id);
}
