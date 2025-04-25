package rw.tumenyeshe.service;

import org.springframework.stereotype.Service;
import rw.tumenyeshe.model.Assignment;

import java.util.List;
import java.util.UUID;

@Service
public class AssignmentServiceImpl implements AssignmentService{
    @Override
    public List<Assignment> getAllAssignments() {
        return null;
    }

    @Override
    public Assignment getAssignmentById(UUID id) {
        return null;
    }

    @Override
    public Assignment saveAssignment(Assignment assignment) {
        return null;
    }

    @Override
    public Assignment updateAssignment(UUID id, Assignment assignment) {
        return null;
    }


    @Override
    public void deleteById(UUID id) {

    }
}
