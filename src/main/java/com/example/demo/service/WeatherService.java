package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.TemperatureStatsDTO;
import com.example.demo.dto.WeatherResponseDTO;

import java.util.List;

public interface WeatherService {

    void uploadData(MultipartFile file);

    List<WeatherResponseDTO> getWeatherByDate(String date);

    List<WeatherResponseDTO> getWeatherByMonth(int year, int month);

    List<TemperatureStatsDTO> getYearlyMonthlyStats(int year);
}