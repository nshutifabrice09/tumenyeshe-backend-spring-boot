package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository <User, UUID> {
}
