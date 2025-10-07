package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.model.OutageEvent;
import rw.tumenyeshe.service.OutageEventService;

@RestController
@CrossOrigin("http://localhost:3000")
public class OutageEventController {

    private final OutageEventService outageEventService;

    @Autowired
    public OutageEventController (OutageEventService outageEventService){
        this.outageEventService = outageEventService;
    }

    @PostMapping("/outageEvent")
    public OutageEvent saveOutageEvent(@RequestBody OutageEvent outageEvent){
        return outageEventService.saveOutageEvent(outageEvent);
    }
}
