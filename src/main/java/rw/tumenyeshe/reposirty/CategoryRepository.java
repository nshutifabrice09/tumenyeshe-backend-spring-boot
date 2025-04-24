package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.Category;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository <Category, UUID> {
}
