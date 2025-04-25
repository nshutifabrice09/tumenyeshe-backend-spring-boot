package rw.tumenyeshe.service;

import org.springframework.stereotype.Service;
import rw.tumenyeshe.model.OutageEvent;

import java.util.List;
import java.util.UUID;

@Service
public class OutageEventServiceImpl implements OutageEventService{
    @Override
    public List<OutageEvent> getAllOutageEvent() {
        return null;
    }

    @Override
    public OutageEvent getOutageEventById(UUID id) {
        return null;
    }

    @Override
    public OutageEvent saveOutageEvent(OutageEvent outageEvent) {
        return null;
    }

    @Override
    public OutageEvent updateOutageEvent(UUID id) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
