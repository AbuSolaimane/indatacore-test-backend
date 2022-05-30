package com.indatacore.demo.service;

import com.indatacore.demo.model.CsvRow;

import java.util.UUID;

public interface CsvRowService {
    CsvRow addRow(CsvRow row);
    void deleteRow(UUID id);
    CsvRow addRandomRow();
}
