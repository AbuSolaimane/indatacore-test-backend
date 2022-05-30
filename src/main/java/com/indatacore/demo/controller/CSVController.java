package com.indatacore.demo.controller;

import com.indatacore.demo.csv.BufferReader;
import com.indatacore.demo.model.CsvRow;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/csv")
public class CSVController {
    @SneakyThrows
    @GetMapping("/")
    List<CsvRow> getData(){
        return BufferReader.getRecords();
    }
}
