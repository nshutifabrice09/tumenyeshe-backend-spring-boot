package rw.tumenyeshe.service;

import rw.tumenyeshe.model.StatusHistory;

import java.util.List;
import java.util.UUID;

public interface StatusHistoryService {
    List<StatusHistory> getAllStatusHistory();
    StatusHistory getStatusHistoryById(UUID id);
    StatusHistory saveStatusHistory (StatusHistory statusHistory);
    StatusHistory updateStatusHistory (UUID id, StatusHistory statusHistory);
    void deleteById (UUID id);
}
