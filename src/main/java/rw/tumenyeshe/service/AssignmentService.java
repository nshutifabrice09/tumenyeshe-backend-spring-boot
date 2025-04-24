package rw.tumenyeshe.service;

import rw.tumenyeshe.model.Assignment;

import java.util.List;
import java.util.UUID;

public interface AssignmentService {
    List<Assignment> getAllAssignments();
    Assignment getAssignmentById(UUID id);
    Assignment saveAssignment (Assignment assignment);
    Assignment updateAssignment (UUID id);
    void deleteById (UUID id);
}
