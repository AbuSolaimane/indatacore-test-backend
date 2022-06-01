package com.indatacore.demo.exceptions;

public class CsvRowNotFoundException extends RuntimeException{

    public CsvRowNotFoundException(Long id) {
        super("the CsvRow with id " + id + " doesn't exist");
    }
}
