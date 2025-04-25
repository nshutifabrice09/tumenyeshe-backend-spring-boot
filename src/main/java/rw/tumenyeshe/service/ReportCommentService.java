package rw.tumenyeshe.service;

import rw.tumenyeshe.model.ReportComment;

import java.util.List;
import java.util.UUID;

public interface ReportCommentService {

    List<ReportComment> getAllReportComment();
    ReportComment getReportCommentById(UUID id);
    ReportComment saveReportComment (ReportComment reportComment);
    ReportComment updateReportComment (UUID id, ReportComment reportComment);
    void deleteById (UUID id);
}
