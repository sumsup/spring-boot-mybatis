package com.memoapp.demo.restservice.search;

import java.util.List;

import com.memoapp.demo.mappers.SearchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memoapp.demo.dto.SearchDTO;

@Service
public class SearchService {
    @Autowired
    private SearchMapper searchMapper;

    public List<SearchDTO> searchMemo() {
        List<SearchDTO> dtoList = searchMapper.selectMemo();

        return dtoList;
    }

}