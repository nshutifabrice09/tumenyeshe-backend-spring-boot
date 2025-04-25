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
    private FaultReport faultReport;

    @ManyToOne
    private MaintenanceTeam maintenanceTeam;

    private LocalDateTime assignedAt;
    private String status;
}
