package com.javareactive.javareactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("person")
public class Person {
    private Integer id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String ip_address;
}
