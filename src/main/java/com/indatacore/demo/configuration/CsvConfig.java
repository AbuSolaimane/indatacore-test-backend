package com.indatacore.demo.configuration;

import com.indatacore.demo.csv.BufferReader;
import com.indatacore.demo.model.CsvRow;
import com.indatacore.demo.repository.CsvRowRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@AllArgsConstructor
public class CsvConfig {

    private final CsvRowRepository csvRowRepository;

    @SneakyThrows
//    @Bean
    List<CsvRow> getDefaultRecords(){
        return csvRowRepository.saveAll(BufferReader.getRecords());
    }
}
