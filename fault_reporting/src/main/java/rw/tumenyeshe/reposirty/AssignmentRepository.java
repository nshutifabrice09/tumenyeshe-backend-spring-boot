package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.Assignment;

import java.util.UUID;

public interface AssignmentRepository extends JpaRepository <Assignment, UUID> {
}
