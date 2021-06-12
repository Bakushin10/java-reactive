package com.javareactive.javareactive.controller;

import com.javareactive.javareactive.entity.Person;
import com.javareactive.javareactive.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/person")
    public Flux<Person> getPerson(){
        System.out.println("getPerson controller");
        Flux<Person> persons = personService.getPerson();

        return persons;
    }
}
