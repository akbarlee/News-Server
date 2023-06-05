
package com.akbarlee.NewsServer.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "news_headlines")
public class NewsHeadlines  {
    @Id
    @GeneratedValue  (strategy = GenerationType.AUTO)
    Long headline_id; ;

    @OneToOne (cascade = CascadeType.ALL )
    @JoinColumn(name = "source_id")
    Source source = null;
    String author = "";
    String title = "";
    String description = "";
    String url = "";
    String urlToImage = "";
    String publishedAt = "";
    String content = "";



    /*@ManyToOne (fetch = FetchType.LAZY )
    @JoinColumn(name = "OWNER_ID")
    private NewsApiResponse owner ;*/


  /*  public NewsApiResponse getResponse() {
        return owner;
    }

    public void setResponse(NewsApiResponse owner) {
        this.owner = owner;
    }*/

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }


    @Override
    public String toString() {
        return "NewsHeadlines{" +
                "headline_id=" + headline_id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", urlToImage='" + urlToImage + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public float getId() {
        return headline_id;
    }

    public void setId(int id) {
        this.headline_id = headline_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
