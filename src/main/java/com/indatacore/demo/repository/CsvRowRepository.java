package com.indatacore.demo.repository;

import com.indatacore.demo.model.CsvRow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CsvRowRepository extends JpaRepository<CsvRow, Long> {
}
