package com.streamflowsolutions.streamflow.service.impl;

import com.streamflowsolutions.streamflow.service.StatisticsCalculationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class StatisticsServiceImplTest {
    @Autowired
    StatisticsServiceImpl statisticsService;

    @Autowired
    StatisticsCalculationService statisticsCalculationService;

    String period = "period";
    ArrayList<String> countries = new ArrayList<String>();

    @Test
    public void testGetView() {
        Mockito.when(statisticsCalculationService.calcViews(period)).thenReturn(1);
        Assertions.assertEquals(1, statisticsService.getViews(period));
    }

    @Test
    public void testGetSubscribedUsers() {
        Mockito.when(statisticsCalculationService.calcSubscribers(period)).thenReturn(1);
        Assertions.assertEquals(1, statisticsService.getSubscribedUsers(period));
    }

    @Test
    public void testGetNewUsers() {
        Mockito.when(statisticsCalculationService.calcUsers(period)).thenReturn(1);
        Assertions.assertEquals(1, statisticsService.getNewUsers(period));
    }

    @Test
    public void testGetViewedHours() {
        Mockito.when(statisticsCalculationService.calcHours(period)).thenReturn(1);
        Assertions.assertEquals(1, statisticsService.getViewedHours(period));
    }

    @Test
    public void testGetVotes() {
        Mockito.when(statisticsCalculationService.calcVotes(period)).thenReturn(1);
        Assertions.assertEquals(1, statisticsService.getVotes(period));
    }

    @Test
    public void testGetComments() {
        Mockito.when(statisticsCalculationService.calcComments(period)).thenReturn(1);
        Assertions.assertEquals(1, statisticsService.getComments(period));
    }

    @Test
    public void testGetVideos() {
        Mockito.when(statisticsCalculationService.calcVideos(period)).thenReturn(1);
        Assertions.assertEquals(1, statisticsService.getVideos(period));
    }

    @Test void testGetTopViewerCountries() {
        countries.add("Ukraine");
        Mockito.when(statisticsCalculationService.calcTopViewerCountries(period)).thenReturn(countries);
        Assertions.assertEquals(countries, statisticsService.getTopViewerCountries(period));
    }
}

