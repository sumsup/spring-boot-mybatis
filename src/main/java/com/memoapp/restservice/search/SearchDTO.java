package com.memoapp.restservice.search;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SearchDTO {
    private long id;
    private int writerId;
    private String memo;
    private String category;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
