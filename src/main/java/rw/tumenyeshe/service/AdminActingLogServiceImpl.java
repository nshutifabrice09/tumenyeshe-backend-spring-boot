package rw.tumenyeshe.service;

import org.springframework.stereotype.Service;
import rw.tumenyeshe.model.AdminActingLog;

import java.util.List;
import java.util.UUID;

@Service
public class AdminActingLogServiceImpl implements AdminActingLogService{
    @Override
    public List<AdminActingLog> getAllAdminActingLogs() {
        return null;
    }

    @Override
    public AdminActingLog getAdminActingLogById(UUID id) {
        return null;
    }

    @Override
    public AdminActingLog saveAdminActingLog(AdminActingLog adminActingLog) {
        return null;
    }

    @Override
    public AdminActingLog updateAdminActingLog(UUID id, AdminActingLog adminActingLog) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
