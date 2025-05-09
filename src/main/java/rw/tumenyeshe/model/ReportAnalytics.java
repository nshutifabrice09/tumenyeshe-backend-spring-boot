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
}
