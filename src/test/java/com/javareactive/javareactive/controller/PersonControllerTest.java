package com.javareactive.javareactive.controller;

import com.javareactive.javareactive.entity.Person;
import com.javareactive.javareactive.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

class PersonControllerTest {

    @InjectMocks
    PersonController personController;

    @Mock
    PersonService personService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("should create person controller and return Flux<person> object")
    void shouldCreatePersonControllerAndReturnFluxPersonObject(){

        Person p = new Person(
                1,
                "John",
                "Oliver",
                "johnoliver@lastweektonight.com",
                "M",
                "111.111.11"
        );
        Flux<Person> person = Flux.just(p);

        when(personController.getPerson()).thenReturn(person);
        Flux<Person> response = personController.getPerson();

        Assertions.assertEquals(person, response);
    }

}