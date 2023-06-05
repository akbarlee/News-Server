package com.akbarlee.NewsServer.DAO;

import com.akbarlee.NewsServer.Models.NewsApiResponse;
import com.akbarlee.NewsServer.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewsDAO {

    @Autowired
      NewsRepository newsRepository;

    public Optional<NewsApiResponse> getById(Long Id) {
        Optional <NewsApiResponse> articles= newsRepository.findById(Id);

        return articles;
    }
}
