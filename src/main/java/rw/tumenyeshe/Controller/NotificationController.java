package rw.tumenyeshe.Controller;

import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.Notification;
import rw.tumenyeshe.service.NotificationService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class NotificationController {

    final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    @PostMapping("/notification")
    public Notification saveNotification (@RequestBody Notification notification){
        return notificationService.saveNotification(notification);
    }

    @GetMapping("/notifications")
    public List<Notification> notificationList(){
        return notificationService.getAllNotification();
    }

    @GetMapping("/notification/{id}")
    public Notification findById(@PathVariable ("id")UUID id){
        return notificationService.getNotificationById(id);
    }

    @PutMapping("/update/notification/{id}")
    public Notification updateNotification(@PathVariable ("id") UUID id, @RequestBody Notification notification){
        return notificationService.updateNotification(id, notification);
    }

    @DeleteMapping("/delete/notification/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        notificationService.deleteById(id);
    }
}
