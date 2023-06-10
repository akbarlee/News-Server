package com.akbarlee.NewsServer.Controller;

import com.akbarlee.NewsServer.DAO.NewsDAO;
import com.akbarlee.NewsServer.Models.NewsApiResponse;
import com.akbarlee.NewsServer.Models.NewsHeadlines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping
public class NewsController {


    @Autowired
      NewsDAO newsDAO;

    @RequestMapping( value = "/news")
    public NewsApiResponse getAllEmployees() {
       NewsApiResponse response = new NewsApiResponse();
       response.setArticles(newsDAO.getAll());
       return response;
    }

    }

