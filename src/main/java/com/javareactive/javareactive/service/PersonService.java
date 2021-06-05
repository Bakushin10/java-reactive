package com.javareactive.javareactive.service;

import com.javareactive.javareactive.entity.Person;
import com.javareactive.javareactive.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Flux<Person> getPerson(){
        System.out.println("getPerson service");
        return personRepository.findAll();
    }
}
