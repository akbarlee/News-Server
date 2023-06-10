package com.akbarlee.NewsServer.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "source_news")
public class Source  implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "source_id")
    @JsonIgnore
    Long snews_id;
    @Column(name = "source_name")
     String name;


    public Long getSnews_id() {
        return snews_id;
    }

    public void setSnews_id(Long snews_id) {
        this.snews_id = snews_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
