package com.streamflowsolutions.streamflow.service;

import com.streamflowsolutions.streamflow.dto.StatisticsDto;
import com.streamflowsolutions.streamflow.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StatisticsService {
    public StatisticsDto getViews(String period);
    public StatisticsDto getSubscribedUsers(String period);
    public StatisticsDto getNewUsers(String period);
    public StatisticsDto getViewedHours(String period);
    public StatisticsDto getVotes(String period);
    public StatisticsDto getComments(String period);
    public StatisticsDto getVideos(String period);
    public StatisticsDto getTopViewerCountries(String period);
}
