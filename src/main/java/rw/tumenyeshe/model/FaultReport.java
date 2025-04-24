package rw.tumenyeshe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name= "faultReport")
public class FaultReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String reporterName;
    private String contactInfo;
    @Enumerated(EnumType.STRING)
    private String category ;
    private String description;
    private double latitude;
    private double longitude;
    private String imageUrl;
    private LocalDateTime reportedAt;
    @Enumerated(EnumType.STRING)
    private String status;

}
