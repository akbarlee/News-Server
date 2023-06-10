package com.akbarlee.NewsServer.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "news_api_response")

public  class NewsApiResponse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "response_id")
    @JsonIgnore
    Long id;
    @Column(name = "response_status")
    String status;
    @Column(name = "response_totalResults")
    int totalResults;


   @OneToMany( fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinColumn(name="headline_id")
   @JsonManagedReference
    List<NewsHeadlines> articles = new ArrayList<>();

    public NewsApiResponse(Long id, String status, int totalResults , List<NewsHeadlines> articles) {
        this.id = id;
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }
  public NewsApiResponse() {

  }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<NewsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsHeadlines> articles) {
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }




}

