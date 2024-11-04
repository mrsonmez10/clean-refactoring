package com.cleanref.chapter07.c01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Encapsulation {

    /*
        - doğrudan erişilebilirlik
        - verilerinde kontrol sağla
        - read only
        - write only
     */

    private String teamName;
    private int teamMemberCount;

}
