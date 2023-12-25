package ma.piko.conferenceService;

import ma.piko.conferenceService.entities.Conference;
import ma.piko.conferenceService.entities.Review;
import ma.piko.conferenceService.enums.ConferenceType;
import ma.piko.conferenceService.repositories.ConferenceRepository;
import ma.piko.conferenceService.repositories.ReviweRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ConferenceApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConferenceApplication.class);
    }


        @Bean
        CommandLineRunner commandLineRunner(ConferenceRepository conferenceRepository, ReviweRepository reviweRepository){

        return args -> {




            Conference conf1= conferenceRepository.findById(1L).orElse(null);

            conferenceRepository.save(new Conference(null,"JAVA", ConferenceType.Academique,new Date(),12,12,12,null));


            reviweRepository.save(new Review(null,new Date(),"Hello",12,null));
            reviweRepository.save(new Review(null,new Date(),"Hamid",12,null));

            reviweRepository.save(new Review(null,new Date(),"GO GO",12,null));

        };


        }






}
