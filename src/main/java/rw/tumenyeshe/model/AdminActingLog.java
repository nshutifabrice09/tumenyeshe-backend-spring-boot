package rw.tumenyeshe.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name= "adminActionLogs")
public class AdminActingLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String adminUsername;
    private String actionType;
    private String targetEntity;
    private String details;

    private LocalDateTime timestamp;
}
