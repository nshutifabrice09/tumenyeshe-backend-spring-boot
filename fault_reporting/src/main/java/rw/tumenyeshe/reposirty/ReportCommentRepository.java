package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.ReportComment;

import java.util.UUID;

public interface ReportCommentRepository extends JpaRepository <ReportComment, UUID> {
}
