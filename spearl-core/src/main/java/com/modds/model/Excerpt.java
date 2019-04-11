package com.modds.model;

import javax.persistence.Entity;

@Entity
public class Excerpt extends BaseEntity<Excerpt> {
    private String excerpt;

    @Override
    public String toString() {
        return "Excerpt{" +
                "excerpt='" + excerpt + '\'' +
                '}';
    }

    public String getExcerpt() {
        return excerpt;
    }

    public Excerpt setExcerpt(String excerpt) {
        this.excerpt = excerpt;
        return this;
    }
}
