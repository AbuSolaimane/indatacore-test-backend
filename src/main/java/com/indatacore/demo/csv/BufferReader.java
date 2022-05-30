package com.indatacore.demo.csv;

import lombok.SneakyThrows;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BufferReader {
    public static String PATH = "data.csv";
    public static String COMMA_DELIMITER = ",";

    @SneakyThrows
    public static List<List<String>> getRecords() throws URISyntaxException {
        List<List<String>> records = new ArrayList<>();
        Resource resource = new ClassPathResource(PATH);
        File file = resource.getFile();
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            String[] values = line.split(COMMA_DELIMITER);
            records.add(Arrays.asList(values));
        }
        return records;
    }
}
