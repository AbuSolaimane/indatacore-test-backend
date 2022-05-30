package com.indatacore.demo.controller;

import com.indatacore.demo.csv.BufferReader;
import com.indatacore.demo.model.CsvRow;
import com.indatacore.demo.service.CsvRowService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.datafaker.fileformats.Csv;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/csv")
@AllArgsConstructor
public class CSVController {
    private final CsvRowService service;

    @SneakyThrows
    @GetMapping("/")
    List<CsvRow> getData(){
        return BufferReader.getRecords();
    }

    @PostMapping("/")
    CsvRow addRandomRow(){
        return service.addRandomRow();
    }
}
