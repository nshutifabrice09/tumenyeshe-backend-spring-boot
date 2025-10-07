package rw.tumenyeshe.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name= "assignments")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "faultReport_id")
    private FaultReport faultReport;

    @ManyToOne
    @JoinColumn(name = "maintenanceTeam_id")
    private MaintenanceTeam maintenanceTeam;

    private LocalDateTime assignedAt;
    private String status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public FaultReport getFaultReport() {
        return faultReport;
    }

    public void setFaultReport(FaultReport faultReport) {
        this.faultReport = faultReport;
    }

    public MaintenanceTeam getMaintenanceTeam() {
        return maintenanceTeam;
    }

    public void setMaintenanceTeam(MaintenanceTeam maintenanceTeam) {
        this.maintenanceTeam = maintenanceTeam;
    }

    public LocalDateTime getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(LocalDateTime assignedAt) {
        this.assignedAt = assignedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
