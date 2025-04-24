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
@Table(name= "reportComments")
public class ReportComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @ManyToOne
    private FaultReport faultReport;

    private String author;
    private String role; // USER, ADMIN
    private String content;
    private LocalDateTime timestamp;

}
