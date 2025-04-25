package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.Assignment;
import rw.tumenyeshe.service.AssignmentService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class AssignmentController {

    private final AssignmentService assignmentService;

    @Autowired
    public AssignmentController (AssignmentService assignmentService){
        this.assignmentService = assignmentService;
    }

    @PostMapping("/assignment")
    public Assignment save(@RequestBody Assignment assignment){
        return assignmentService.saveAssignment(assignment);
    }

    @GetMapping("/assignments")
    public List<Assignment> assignmentList(){
        return assignmentService.getAllAssignments();
    }

    @GetMapping("/assignment/{id}")
    public Assignment findById(@PathVariable ("id")UUID id){
        return assignmentService.getAssignmentById(id);
    }

    @PutMapping("/update/assignment/{id}")
    public Assignment updateAssignment(@PathVariable ("id") UUID id, @RequestBody Assignment assignment){
        return assignmentService.updateAssignment(id, assignment);
    }
}
