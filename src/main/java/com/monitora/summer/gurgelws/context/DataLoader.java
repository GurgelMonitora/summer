package com.monitora.summer.gurgelws.context;

import com.monitora.summer.gurgelws.model.Person;
import com.monitora.summer.gurgelws.repositories.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@Slf4j
public class DataLoader {
    @Bean
    CommandLineRunner initDatabase(PersonRepository repository) {
        return args -> { 
            log.info("Preloading " + repository.save(new Person("Paulo Gurgel", "Jockey street", new Date())));
            log.info("Preloading " + repository.save(new Person("Paula SC", "West Barbara the Saint Street",  new Date())));
            log.info("Preloading " + repository.save(new Person("Fernanda K", "Mococa",  new Date())));
            log.info("Preloading " + repository.save(new Person("Adriane R", "Orange city",  new Date())));
            log.info("Preloading " + repository.save(new Person("Carina P", "Big beach", new Date())));
            log.info("Preloading " + repository.save(new Person("Victor R", "Rich black river street",new Date())));
            log.info("Preloading " + repository.save(new Person("Lucas S", "Naive sancarlino",  new Date())));
            log.info("Preloading " + repository.save(new Person("Alvaro M", "Piracity street",  new Date())));
        };
    }
}
