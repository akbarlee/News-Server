package com.akbarlee.NewsServer.Controller;

import com.akbarlee.NewsServer.DAO.NewsDAO;
import com.akbarlee.NewsServer.Models.NewsApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class NewsController {
    @Autowired
      NewsDAO newsDAO;
      NewsApiResponse newsApiResponse;

    @GetMapping( value = "/news/{id}")
    public Optional<NewsApiResponse> getById(@PathVariable(value = "id") Long id) {

        Optional<NewsApiResponse> playList = newsDAO.getById(id);
        return playList;
    }
}
