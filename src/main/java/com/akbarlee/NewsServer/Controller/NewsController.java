package com.akbarlee.NewsServer.Controller;

import com.akbarlee.NewsServer.DAO.NewsDAO;
import com.akbarlee.NewsServer.Models.NewsApiResponse;
import com.akbarlee.NewsServer.Models.NewsHeadlines;
import com.akbarlee.NewsServer.Models.Source;
import com.akbarlee.NewsServer.Repository.NewsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class NewsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);
    @Autowired
    NewsDAO newsDAO;
    @Autowired
     NewsRepository newsRepository;

    @RequestMapping(value = "/news")
    public NewsApiResponse getAllNews(@RequestParam(name = "category", required = false) String category) {
        NewsApiResponse response = new NewsApiResponse();
        List<NewsHeadlines> newsList;
        if (category == null) {
            // no category specified, return all news
            newsList = newsDAO.getAll();
        } else {
            // category specified, return filtered news
            newsList = newsDAO.getAllByCategory(category);
        }
        response.setTotalResults(newsList.size());
        response.setArticles(newsList);
        if (response.getArticles() != null && !response.getArticles().isEmpty()) {
            response.setStatus("Success");
        }
        System.out.println("Response elementi "+ response.toString());
        return response;
    }





}

