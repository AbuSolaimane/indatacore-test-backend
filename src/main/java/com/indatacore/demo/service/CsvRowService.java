package com.indatacore.demo.service;

import com.indatacore.demo.model.CsvRow;

import java.util.List;
import java.util.Optional;

public interface CsvRowService {
    CsvRow addRow(CsvRow row);
    void deleteRow(Long id);
    CsvRow addRandomRow();
    List<CsvRow> getAllData();
    Optional<CsvRow> findById(Long id);
}
