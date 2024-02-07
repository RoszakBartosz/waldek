package org.roszak.szkolarodzneia;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Mother {
    private Long id;
    private String name;
    private Set<Kid> kids;

    public Mother(Long id, String name) {
        this.id = id;
        this.name = name;
        this.kids = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Mother{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kids=" + kids +
                '}';
    }

    public static List<Mother> hasMoreKidsThanOne(List<Mother> mothers){
        List<Mother> mothersxd = mothers.stream()
                .filter(mother -> mother.getKids().size() > 1)
                .toList();

        return mothersxd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Kid> getKids() {
        return kids;
    }

    public void setKids(Set<Kid> kids) {
        this.kids = kids;
    }
}
