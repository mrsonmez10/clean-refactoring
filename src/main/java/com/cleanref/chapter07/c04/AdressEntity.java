package com.cleanref.chapter07.c04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// THINK THIS IS DB ENTITY
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdressEntity {

    // UUID vs int?
    private String id;
    private String street;
    private String streetExtra;
    private String city;
    private String state;
    private String zip;

}
