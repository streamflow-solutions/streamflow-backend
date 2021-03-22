package com.streamflowsolutions.streamflow.service;

import com.streamflowsolutions.streamflow.dto.StatisticsDto;
import com.streamflowsolutions.streamflow.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StatisticsService {
    public StatisticsDto getViewsByPeriod(String period);
    public StatisticsDto getSubscribedUsers(User user);
    public StatisticsDto getNewUsersByPeriod(String period);
    public StatisticsDto getViewedHoursForPeriod(String period);
    public StatisticsDto getVotesByVideo(Video video);
    public StatisticsDto getCommentsByVideo(Video video);
    public StatisticsDto getVideosByUser(User user);
    public StatisticsDto getTopViewerCountries();
}
