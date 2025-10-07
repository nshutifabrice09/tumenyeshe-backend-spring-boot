package rw.tumenyeshe.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name= "reportAnalytics")
public class ReportAnalytics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String category;
    private int totalReports;
    private int pending;
    private int resolved;

    private String month;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTotalReports() {
        return totalReports;
    }

    public void setTotalReports(int totalReports) {
        this.totalReports = totalReports;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getResolved() {
        return resolved;
    }

    public void setResolved(int resolved) {
        this.resolved = resolved;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
