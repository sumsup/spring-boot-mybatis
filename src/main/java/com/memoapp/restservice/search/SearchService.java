package com.memoapp.restservice.search;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    private SearchDAO searchDAO;

    public List<SearchDTO> searchMemo(int writerId) throws Exception {
        List<SearchDTO> dtoList = searchDAO.selectMemo(writerId);

        return dtoList;
    }

}
