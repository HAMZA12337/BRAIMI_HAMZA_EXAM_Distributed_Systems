package ma.piko.keynoteService;


import ma.piko.keynoteService.entities.Keynote;
import ma.piko.keynoteService.repositories.KeynoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class KeynoteApplication {

    public static void main(String[] args) {

        SpringApplication.run( KeynoteApplication.class);
    }


        @Bean
        CommandLineRunner commandLineRunner(KeynoteRepository keynoteRepository){

        return args -> {

            keynoteRepository.save(new Keynote(null,"HAMZA","BRAIMI","W@GMAIL.COM","Enginner"));
            keynoteRepository.save(new Keynote(null,"Hamid","BRAIMI","W@GMAIL.COM","Enginner"));
            keynoteRepository.save(new Keynote(null,"HAMZA","BRAIMI","W@GMAIL.COM","Enginner"));





        };


        }






}
