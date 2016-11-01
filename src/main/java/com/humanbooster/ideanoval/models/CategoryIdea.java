package com.humanbooster.ideanoval.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Nea on 22/10/2016.
 */
@Entity
public class CategoryIdea implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // TODO Trouver le type de Fetch à mettre pour pouvoir afficher les catégories d'idées
    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Idea> ideas;

    private String label;

    private String description;

    public CategoryIdea() {
    }

    public CategoryIdea(String label, String description) {
        this.label = label;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CategoryIdea{" +
                "id=" + id +
                ", ideas=" + ideas +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
