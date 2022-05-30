package com.indatacore.demo.service;

import com.indatacore.demo.model.CsvRow;
import com.indatacore.demo.model.Gender;
import com.indatacore.demo.repository.CsvRowRepository;
import lombok.AllArgsConstructor;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.Random;
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
        Random random = new Random();
        Faker faker = new Faker();
        CsvRow row = new CsvRow();
        row.setId(UUID.randomUUID());
        row.setName(faker.name().fullName());
        row.setWeeks(300 + random.nextInt(100));
        row.setGender(random.nextInt(10) % 2 == 0? Gender.MALE : Gender.FEMALE);
        return repository.save(row);
    }
}
