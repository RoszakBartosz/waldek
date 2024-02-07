package org.roszak.asocjacje.relacje.manyToMany.biDirectional;

import java.time.LocalDate;
import java.util.List;

public class Flight {
    private String from;
    private String to;
    private LocalDate date;
    private List<Person> persons;

}
