package rw.tumenyeshe.service;

import org.springframework.stereotype.Service;
import rw.tumenyeshe.model.StatusHistory;

import java.util.List;
import java.util.UUID;

@Service
public class StatusHistoryServiceImpl implements StatusHistoryService{
    @Override
    public List<StatusHistory> getAllStatusHistory() {
        return null;
    }

    @Override
    public StatusHistory getStatusHistoryById(UUID id) {
        return null;
    }

    @Override
    public StatusHistory saveStatusHistory(StatusHistory statusHistory) {
        return null;
    }

    @Override
    public StatusHistory updateStatusHistory(UUID id) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
