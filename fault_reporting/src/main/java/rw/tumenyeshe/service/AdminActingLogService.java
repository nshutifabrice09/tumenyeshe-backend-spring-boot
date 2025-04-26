package rw.tumenyeshe.service;

import rw.tumenyeshe.model.AdminActingLog;

import java.util.List;
import java.util.UUID;

public interface AdminActingLogService {
    List<AdminActingLog> getAllAdminActingLogs();
    AdminActingLog getAdminActingLogById(UUID id);
    AdminActingLog saveAdminActingLog(AdminActingLog adminActingLog);
    AdminActingLog updateAdminActingLog(UUID id, AdminActingLog adminActingLog);
    void deleteById(UUID id);
}
