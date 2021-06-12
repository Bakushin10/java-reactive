package com.javareactive.javareactive.repository;

import com.javareactive.javareactive.entity.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Person, String> {
}
