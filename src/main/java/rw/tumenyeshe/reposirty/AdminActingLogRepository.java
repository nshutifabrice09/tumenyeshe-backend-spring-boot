package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdminActingLog extends JpaRepository <AdminActingLog,UUID> {
}
