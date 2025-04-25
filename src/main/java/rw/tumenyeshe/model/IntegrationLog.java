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
@Table(name= "integrationLogs")
public class IntegrationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String sourceSystem;
    private String action;
    private String payload;
    private LocalDateTime timestamp;
    private boolean success;
}
