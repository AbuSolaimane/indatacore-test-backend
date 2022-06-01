package com.indatacore.demo.csv;

import com.indatacore.demo.model.CsvRow;
import com.indatacore.demo.model.Gender;
import lombok.SneakyThrows;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BufferReader {
    public static String PATH = "data.csv";
    public static String COMMA_DELIMITER = ",";

    @SneakyThrows
    public static List<CsvRow> getRecords() throws URISyntaxException {
        List<CsvRow> records = new ArrayList<>();
        Resource resource = new ClassPathResource(PATH);
        File file = resource.getFile();
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            String[] values = line.split(COMMA_DELIMITER);
            CsvRow data = new CsvRow();
            data.setId(Long.valueOf(values[0]));
            data.setName(values[1]);
            data.setWeeks(Integer.valueOf(values[2]));
            data.setGender( "Female".equals(values[3]) ? Gender.FEMALE : Gender.MALE);
            records.add(data);
        }
        return records;
    }
}
