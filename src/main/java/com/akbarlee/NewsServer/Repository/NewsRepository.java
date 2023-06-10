package com.akbarlee.NewsServer.Repository;

import com.akbarlee.NewsServer.Models.NewsApiResponse;
import com.akbarlee.NewsServer.Models.NewsHeadlines;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface NewsRepository extends JpaRepository<NewsHeadlines, Long> {


}
