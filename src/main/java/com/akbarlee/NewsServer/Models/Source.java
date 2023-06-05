package com.akbarlee.NewsServer.Models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "source_news")
public class Source   {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long snews_id;
    private String name;




    public float getId() {
        return snews_id;
    }

    public void setId(Long id) {
        this.snews_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
