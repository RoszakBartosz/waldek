package org.roszak.szkolarodzneia;

public class Kid {
    private Long id;
    private String name;
    private Mother mother;

    public Kid(Long id, String name, Mother mother) {
        this.id = id;
        this.name = name;
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mother=" + mother.getName() +
                '}';
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

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }
}
