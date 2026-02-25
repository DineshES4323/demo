package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Weather;

import java.time.LocalDateTime;
import java.util.List;

public interface WeatherRepository extends JpaRepository<Weather, Long> {

    List<Weather> findByDateTimeBetween(
            LocalDateTime start,
            LocalDateTime end);
}