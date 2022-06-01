package com.indatacore.demo.controller;

import com.indatacore.demo.csv.BufferReader;
import com.indatacore.demo.exceptions.CsvRowNotFoundException;
import com.indatacore.demo.model.CsvRow;
import com.indatacore.demo.service.CsvRowService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/csv")
@AllArgsConstructor
public class CSVController {
    private final CsvRowService service;

    @SneakyThrows
    @GetMapping("/static")
    List<CsvRow> getStaticData(){
        return BufferReader.getRecords();
    }

    @GetMapping("/")
    List<CsvRow> getData(){
        return service.getAllData();
    }

    @PostMapping("/")
    CsvRow addRandomRow(){
        return service.addRandomRow();
    }

    @PostMapping("/row")
    CsvRow addRow(@RequestBody CsvRow row){
        return service.addRow(row);
    }

    @DeleteMapping("row/{id}")
    void deleteRow(@PathVariable Long id){

        service.findById(id).orElseThrow(() -> {
            return new CsvRowNotFoundException(id);
        });
        service.deleteRow(id);
    }

    @GetMapping("row/{id}")
    CsvRow findRowById(@PathVariable Long id){
        return service.findById(id).orElseThrow(() -> {
            return new CsvRowNotFoundException(id);
        });
    }
}
