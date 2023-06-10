package com.akbarlee.NewsServer.Controller;

import com.akbarlee.NewsServer.DAO.NewsDAO;
import com.akbarlee.NewsServer.Models.NewsApiResponse;
import com.akbarlee.NewsServer.Models.NewsHeadlines;
import com.akbarlee.NewsServer.Models.Source;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping
public class NewsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);
    @Autowired
      NewsDAO newsDAO;

    @RequestMapping( value = "/news")
    public NewsApiResponse getAllEmployees() {
       NewsApiResponse response = new NewsApiResponse();
       response.setTotalResults(newsDAO.getAll().size());
       response.setArticles(newsDAO.getAll());
        if (response.getArticles() != null && !response.getArticles().isEmpty()) {
            response.setStatus("Success");

        }


        LOGGER.info("Source test " +   response.getArticles().get(0).getSource());
       return response;
    }

    }

