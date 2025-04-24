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
@Data
@Entity
@Table(name= "faultReports")
public class FaultReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String reporterName;
    private String contactInfo;

    @ManyToOne
    private Category category;
    private String description;
    private double latitude;
    private double longitude;
    private String imageUrl;
    private LocalDateTime reportedAt;
    @Enumerated(EnumType.STRING)
    private String status;

}
