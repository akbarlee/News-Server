package com.akbarlee.NewsServer.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "news_api_response")

public  class NewsApiResponse  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long response_id;
    @Column(name = "response_status")
    String status;
    @Column(name = "response_totalResults")
    int totalResults;


    @OneToMany
    @JoinColumn(name="OWNER_ID", referencedColumnName="RESPONSE_ID")
    List<NewsHeadlines> articles ;


    public float getResponse_id() {
        return response_id;
    }

    public void setResponse_id(Long response_id) {
        this.response_id = response_id;
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

    public List<NewsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles( List<NewsHeadlines> articles) {
        this.articles = articles;
    }


}

