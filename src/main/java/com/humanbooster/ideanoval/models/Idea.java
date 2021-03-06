package com.humanbooster.ideanoval.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * Created by Nea on 22/10/2016.
 */
@Entity
public class Idea implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String description;

    private boolean active;

    private Date publicationDate;

    private boolean votable;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private CategoryIdea category;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Idea() {
    }

    /**
     * Constructeur provisoire afin de simplifier la mise en place de l'application
     * @param title
     * @param description
     */
    public Idea(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /**
     * Constructeur provisoire afin de simplifier la mise en place de l'application
     * @param title
     * @param description
     * @param user
     */
    public Idea(String title, String description, User user) {
        this.title = title;
        this.description = description;
        this.publicationDate = new Date();
        this.user = user;
    }

    public Idea(String title, String description, CategoryIdea category, User user) {
        this.title = title;
        this.description = description;
        this.publicationDate = new Date();
        this.category = category;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isVotable() {
        return votable;
    }

    public void setVotable(boolean votable) {
        this.votable = votable;
    }

    public CategoryIdea getCategory() {
        return category;
    }

    public void setCategory(CategoryIdea category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Idea{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                ", publicationDate=" + publicationDate +
                ", votable=" + votable +
                ", category=" + category +
                ", user=" + user +
                '}';
    }
}
