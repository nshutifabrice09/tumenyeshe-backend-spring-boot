package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.service.AssignmentService;

@RestController
@CrossOrigin("http://localhost:3000")
public class AssignmentController {

    private final AssignmentService assignmentService;

    @Autowired
    public AssignmentController (AssignmentService assignmentService){
        this.assignmentService = assignmentService;
    }
}
