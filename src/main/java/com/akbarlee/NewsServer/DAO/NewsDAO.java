package com.akbarlee.NewsServer.DAO;

import com.akbarlee.NewsServer.Models.NewsApiResponse;
import com.akbarlee.NewsServer.Models.NewsHeadlines;
import com.akbarlee.NewsServer.Repository.NewsRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service

public class NewsDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewsDAO.class);
    @Autowired
      NewsRepository newsRepository;

    public List<NewsHeadlines> getAll() {
        try {
            LOGGER.info("Work " + newsRepository.findAll());
            return newsRepository.findAll();
        } catch (Exception e) {

            LOGGER.info("Fail");

            return Collections.emptyList();
        }
    }

    public NewsDAO(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }
}
