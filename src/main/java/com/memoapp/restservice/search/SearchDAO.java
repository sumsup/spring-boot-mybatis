package com.memoapp.restservice.search;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface SearchDAO {
    List<SearchDTO> selectMemo(int writerId) throws Exception;
}
