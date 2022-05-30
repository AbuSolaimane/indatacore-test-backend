package com.indatacore.demo.service;

import com.indatacore.demo.model.CsvRow;
import com.indatacore.demo.repository.CsvRowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CsvRowServiceImpl implements CsvRowService{
    private final CsvRowRepository repository;

    @Override
    public CsvRow addRow(CsvRow row) {
        return repository.save(row);
    }

    @Override
    public void deleteRow(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public CsvRow addRandomRow() {
        return null;
    }
}
