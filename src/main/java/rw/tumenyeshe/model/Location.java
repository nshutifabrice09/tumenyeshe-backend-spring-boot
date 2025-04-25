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
@Table(name= "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private double latitude;
    private double longitude;
    private String address;

    @ManyToOne
    private Zone zone;
}
