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
@Table(name= "statusHistories")
public class StatusHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    private FaultReport faultReport;

    private String oldStatus;
    private String newStatus;
    private LocalDateTime changedAt;
    private String changedBy;
}
