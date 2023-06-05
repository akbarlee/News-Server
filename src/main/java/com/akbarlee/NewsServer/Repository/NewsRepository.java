package com.akbarlee.NewsServer.Repository;

import com.akbarlee.NewsServer.Models.NewsApiResponse;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NewsRepository extends JpaRepository<NewsApiResponse, Long> {

              Optional<NewsApiResponse> findById(Long id);

}
