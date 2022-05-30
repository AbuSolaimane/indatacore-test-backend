package com.indatacore.demo.configuration;

import com.indatacore.demo.csv.BufferReader;
import com.indatacore.demo.model.CsvRow;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CsvConfig {
    @SneakyThrows
    @Bean
    List<CsvRow> getDefaultRecords(){
        return BufferReader.getRecords();
    }
}
