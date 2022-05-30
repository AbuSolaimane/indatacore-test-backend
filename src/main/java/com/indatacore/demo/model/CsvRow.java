package com.indatacore.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class CsvRow {
    @Id
    private UUID id = UUID.randomUUID();
    private String name;
    private int weeks;
    private Gender gender;
}
