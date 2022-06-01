package com.indatacore.demo.service;

import com.indatacore.demo.model.CsvRow;
import com.indatacore.demo.model.Gender;
import com.indatacore.demo.repository.CsvRowRepository;
import lombok.AllArgsConstructor;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class CsvRowServiceImpl implements CsvRowService{
    private final CsvRowRepository repository;

    @Override
    public CsvRow addRow(CsvRow row) {
        return repository.save(row);
    }

    @Override
    public void deleteRow(Long id) {
        repository.deleteById(id);
    }

    @Override
    public CsvRow addRandomRow() {
        Random random = new Random();
        Faker faker = new Faker();
        CsvRow row = new CsvRow();
        row.setName(faker.name().fullName());
        row.setWeeks(300 + random.nextInt(100));
        row.setGender(random.nextInt(10) % 2 == 0? Gender.MALE : Gender.FEMALE);
        return repository.save(row);
    }

    @Override
    public List<CsvRow> getAllData() {
        return repository.findAll();
    }

    @Override
    public Optional<CsvRow> findById(Long id) {
        return repository.findById(id);
    }
}
