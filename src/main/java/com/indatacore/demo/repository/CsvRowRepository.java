package com.indatacore.demo.repository;

import com.indatacore.demo.model.CsvRow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CsvRowRepository extends JpaRepository<CsvRow, UUID> {
}
