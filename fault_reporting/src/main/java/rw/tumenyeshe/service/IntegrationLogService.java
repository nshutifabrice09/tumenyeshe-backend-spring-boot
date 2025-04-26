package rw.tumenyeshe.service;

import rw.tumenyeshe.model.IntegrationLog;

import java.util.List;
import java.util.UUID;

public interface IntegrationLogService {

    List<IntegrationLog> getAllIntegrationLog();
    IntegrationLog getIntegrationLogById(UUID id);
    IntegrationLog saveIntegrationLog (IntegrationLog integrationLog);
    IntegrationLog updateIntegrationLog (UUID id, IntegrationLog integrationLog);
    void deleteById (UUID id);
}
