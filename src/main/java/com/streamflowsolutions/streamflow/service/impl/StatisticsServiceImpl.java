package com.streamflowsolutions.streamflow.service.impl;

import com.google.gson.internal.$Gson$Preconditions;
import com.streamflowsolutions.streamflow.dto.StatisticsDto;
import com.streamflowsolutions.streamflow.entity.User;
import com.streamflowsolutions.streamflow.service.StatisticsService;
import com.streamflowsolutions.streamflow.service.StatisticsCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Autowired
    private final StatisticsCalculationService statisticsCalculationService;

    public StatisticsServiceImpl(StatisticsCalculationService statisticsCalculationService) {
        this.statisticsCalculationService = statisticsCalculationService;
    }

    @Override
    public StatisticsDto getViews(String period) {
        statisticsCalculationService.calcViews(period);
        return null;
    }

    @Override
    public StatisticsDto getSubscribedUsers(String period) {
        statisticsCalculationService.calcSubscribers(period);
        return null;
    }

    @Override
    public StatisticsDto getNewUsers(String period) {
        statisticsCalculationService.calcUsers(period);
        return null;
    }

    @Override
    public StatisticsDto getViewedHours(String period) {
        statisticsCalculationService.calcHours(period);
        return null;
    }

    @Override
    public StatisticsDto getVotes(String period) {
        statisticsCalculationService.calcVotes(period);
        return null;
    }

    @Override
    public StatisticsDto getComments(String period) {
        statisticsCalculationService.calcComments(period);
        return null;
    }

    @Override
    public StatisticsDto getVideos(String period) {
        statisticsCalculationService.calcVideos(period);
        return null;
    }

    @Override
    public StatisticsDto getTopViewerCountries(String period) {
        statisticsCalculationService.calcTopViewerCountries(period);
        return null;
    }
}
