package com.memoapp.demo.mappers;

import com.memoapp.demo.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SearchMapper {
    List<SearchDTO> selectMemo();
}
