package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.Notification;

import java.util.UUID;

public interface NotificationRepository extends JpaRepository <Notification, UUID> {
}
