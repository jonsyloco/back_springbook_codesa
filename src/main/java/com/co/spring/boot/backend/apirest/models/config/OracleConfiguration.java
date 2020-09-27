package com.co.spring.boot.backend.apirest.models.config;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

//@Configuration
public class OracleConfiguration {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;

    @Bean
    DataSource dataSource() throws SQLException{
        System.out.println("llegueeeeeeeeeee++++++++");
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(this.username);
        dataSource.setPassword(this.password);
        dataSource.setURL(this.url);
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return  dataSource;
    }
}
