package com.memoapp.demo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import com.memoapp.demo.dto.SearchDTO;

@Mapper
public interface SearchMapper {
    public List<SearchDTO> selectMemo(@Param("writerId") int writerId) throws Exception;
}
