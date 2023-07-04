package com.akbarlee.NewsServer.DAO;

import com.akbarlee.NewsServer.Models.NewsHeadlines;
import com.akbarlee.NewsServer.Repository.NewsRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class NewsDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewsDAO.class);
    @Autowired
    NewsRepository newsRepository;

    public List<NewsHeadlines> getAll() {
        try {
            List<NewsHeadlines> headlines = newsRepository.findAll();
            LOGGER.info("Work " + headlines);

            for (NewsHeadlines headline : headlines) {
                     // getSource test
                if (headline.getSource() != null) {
                    System.out.println(headline.getSource().getName());
                    System.out.println(headline.getSource().getSnews_id());
                }
            }
            return headlines;
        } catch (Exception e) {

            LOGGER.info("Fail");

            return Collections.emptyList();
        }

    }
    public List<NewsHeadlines> getAllByCategory(String category) {
        List<NewsHeadlines> headlines = newsRepository.findAll();
        return headlines.stream()
                .filter(news -> news.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public NewsDAO(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }
}
