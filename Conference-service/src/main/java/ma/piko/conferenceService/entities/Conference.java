package ma.piko.conferenceService.entities;


import jakarta.persistence.*;
import lombok.*;
import ma.piko.conferenceService.enums.ConferenceType;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
@Builder
public class Conference {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private ConferenceType type_conf;
    private Date date;
    private int duration;
    private int attendees;
    private int score;
    @OneToMany(mappedBy = "conference" ,fetch = FetchType.LAZY)
    private List<Review> list_reviews;





}
