package com.akbarlee.NewsServer.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "news_headlines")
public class NewsHeadlines implements Serializable {
    @Id
    @GeneratedValue  (strategy = GenerationType.AUTO)
    @JsonIgnore
    @Column(name = "headline_id")
    Long id; ;


    @OneToOne (cascade = CascadeType.ALL , fetch = FetchType.EAGER )
    @JoinColumn(name = "s_id" , referencedColumnName = "source_id")
    Source source = new Source();

    @Column(name = "author")
    String author = "";
    @Column(name = "title")
    String title = "";
    @Column(name = "description")
    String description = "";
    @Column(name = "url")
    String url = "";
    @Column(name = "urlToImage")
    String urlToImage = "";
    @Column(name = "publishedAt")
    String publishedAt = "";
    @Column(name = "content")
    String content = "";
    @Column(name = "country")
    String country = "";
    @Column(name = "category")
    String category = "";





    public NewsHeadlines() {

    }

   /*@ManyToOne (fetch = FetchType.EAGER )
   @JoinColumn(name = "OWNER_ID")
   @JsonIgnore
   private NewsApiResponse owner ;*/


  /*public NewsApiResponse getResponse() {
        return owner;
    }

    public void setResponse(NewsApiResponse owner) {
        this.owner = owner; }
*/

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }


    @Override
    public String toString() {
        return "NewsHeadlines{" +
                "id=" + id +
                ", source=" + source +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", urlToImage='" + urlToImage + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", content='" + content + '\'' +
                ", country='" + country + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}