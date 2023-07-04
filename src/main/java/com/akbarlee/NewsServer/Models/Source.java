package com.akbarlee.NewsServer.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "source_news")
public class Source  implements Serializable  {
    @Id
    @Column(name = "source_id")

    Long snews_id;
    @Column(name = "source_name")
    String name;

 @OneToOne(mappedBy = "source", cascade = CascadeType.ALL , fetch = FetchType.EAGER )
  NewsHeadlines newsHeadlines;


    @Override
    public String toString() {
        return "Source{" +
                "snews_id=" + snews_id +
                ", name='" + name + '\'' +
                '}';
    }

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