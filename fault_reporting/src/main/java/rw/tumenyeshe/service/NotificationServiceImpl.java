package rw.tumenyeshe.service;

import org.springframework.stereotype.Service;
import rw.tumenyeshe.model.Notification;

import java.util.List;
import java.util.UUID;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public List<Notification> getAllNotification() {
        return null;
    }

    @Override
    public Notification getNotificationById(UUID id) {
        return null;
    }

    @Override
    public Notification saveNotification(Notification notification) {
        return null;
    }

    @Override
    public Notification updateNotification(UUID id, Notification notification) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
