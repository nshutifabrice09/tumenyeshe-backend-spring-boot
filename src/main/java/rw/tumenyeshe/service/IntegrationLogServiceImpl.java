package rw.tumenyeshe.service;

import org.springframework.stereotype.Service;
import rw.tumenyeshe.model.IntegrationLog;

import java.util.List;
import java.util.UUID;

@Service
public class IntegrationLogServiceImpl implements IntegrationLogService{

    @Override
    public List<IntegrationLog> getAllIntegrationLog() {
        return null;
    }

    @Override
    public IntegrationLog getIntegrationLogById(UUID id) {
        return null;
    }

    @Override
    public IntegrationLog saveIntegrationLog(IntegrationLog integrationLog) {
        return null;
    }

    @Override
    public IntegrationLog updateIntegrationLog(UUID id) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
