package com.cleanref.chapter05.c11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CD {

    private String title;
    private String author;
    private int tracks;
    private int duration;

}
