package ma.piko.conferenceService.entities;


import jakarta.persistence.*;
import lombok.*;
import ma.piko.conferenceService.enums.ConferenceType;

import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
@Builder
public class Review {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private Date date;
    private String text;
    private int stars;
    @ManyToOne
    private Conference conference;





}
