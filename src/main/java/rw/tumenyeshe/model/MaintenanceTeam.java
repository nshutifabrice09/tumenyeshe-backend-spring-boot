package rw.tumenyeshe.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Data
@Table(name= "maintenanceTeams")
public class MaintenanceTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String teamName;
    private String phoneNumber;
    private String location;
    private String specialty;
}
