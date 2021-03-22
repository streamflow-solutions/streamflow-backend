package com.streamflowsolutions.streamflow.service.impl;

import com.streamflowsolutions.streamflow.dto.StatisticsDto;
import com.streamflowsolutions.streamflow.entity.User;
import com.streamflowsolutions.streamflow.service.StatisticsService;
import com.streamflowsolutions.streamflow.service.StatisticsCalculationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StatisticsServiceImpl implements StatisticsService {
    @Autowired
    private final StatisticsCalculationService statisticsCalculationService;

    public StatisticsServiceImpl(StatisticsCalculationService statisticsCalculationService) {
        this.statisticsCalculationService = statisticsCalculationService;
    }

    @Override
    public StatisticsDto getViewsByPeriod(String period) {

    }

    @Override
    public StatisticsDto getSubscribedUsers(User user) {

    }

    @Override
    public StatisticsDto getNewUsersByPeriod(String period) {

    }

    @Override
    public StatisticsDto getViewedHoursForPeriod(String period) {

    }

    @Override
    public StatisticsDto getVotesByVideo(Video video) {

    }

    @Override
    public StatisticsDto getCommentsByVideo(Video video) {

    }

    @Override
    public StatisticsDto getVideosByUser(User user) {

    }

    @Override
    public StatisticsDto getTopViewerCountries() {

    }
}
