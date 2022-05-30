package com.indatacore.demo.controller;

import com.indatacore.demo.csv.BufferReader;
import com.indatacore.demo.model.CsvData;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/csv")
public class CSV {
    @SneakyThrows
    @GetMapping("/")
    List<CsvData> getData(){
        return BufferReader.getRecords();
    }
}
