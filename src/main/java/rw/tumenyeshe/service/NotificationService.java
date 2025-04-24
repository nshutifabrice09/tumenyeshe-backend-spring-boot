package rw.tumenyeshe.service;

import rw.tumenyeshe.model.Notification;

import java.util.List;
import java.util.UUID;

public interface NotificationService {
    List<Notification> getAllNotification();
    Notification getNotificationById(UUID id);
    Notification saveNotification (Notification notification);
    Notification updateNotification (UUID id);
    void deleteById (UUID id);
}
