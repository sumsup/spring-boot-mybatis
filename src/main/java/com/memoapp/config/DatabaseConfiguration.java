package com.memoapp.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
@MapperScan(basePackages = "com.memoapp.*")
public class DatabaseConfiguration {

//    @Bean
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//
//        sqlSessionFactory.setDataSource(dataSource);
//    }


}
