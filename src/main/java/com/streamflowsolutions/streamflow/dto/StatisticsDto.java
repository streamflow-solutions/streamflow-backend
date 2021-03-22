package com.streamflowsolutions.streamflow.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = { "password" })
@ToString(exclude = { "password" })

public class StatisticsDto {
    private int views;
    private int subscribers;
    private int newUsers;
    private int viewedHours;
    private int votes;
    private int comments;
    private int usersVideos;
    private List<String> countries;
}
