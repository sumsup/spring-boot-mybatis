package com.memoapp.demo.restservice.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.memoapp.demo.dto.SearchDTO;

@RestController
public class SearchController {
    @Autowired
    private SearchService searchService;

    @GetMapping("/search")
    public List<SearchDTO> searchMemo(int writerId) throws Exception {
        List<SearchDTO> dtoList = searchService.searchMemo(writerId);

        return dtoList;
    }


}
