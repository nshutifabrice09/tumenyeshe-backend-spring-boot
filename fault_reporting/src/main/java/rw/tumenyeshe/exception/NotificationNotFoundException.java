package rw.tumenyeshe.exception;

import java.util.UUID;

public class NotificationNotFoundException extends RuntimeException{
    public  NotificationNotFoundException (UUID id){
        super ("Could not find a Notification with id "+id);
    }
}
