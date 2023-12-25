package ma.piko.keynoteService.entities;


import jakarta.persistence.*;
import lombok.*;



@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
@Builder
public class Keynote {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String function;





}
