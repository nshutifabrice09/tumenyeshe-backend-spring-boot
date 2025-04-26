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
@Table(name= "zones")
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String province;
    private String district;
    private String sector;
    private String cell;

}
