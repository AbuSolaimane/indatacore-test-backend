package com.indatacore.demo.configuration;

import com.indatacore.demo.csv.BufferReader;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CsvConfig {
    @SneakyThrows
    @Bean
    List<List<String>> getDefaultRecords(){
        return BufferReader.getRecords();
    }
}
