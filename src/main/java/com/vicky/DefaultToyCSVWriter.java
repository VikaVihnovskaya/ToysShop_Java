package com.vicky;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class DefaultToyCSVWriter implements ToyCSVWriter {
    public static final String[] HEADERS = {"id", "name"};
    private static final String SAMPLE_CSV_FILE = "./sample.csv";

    @Override
    public void writeToyToCsv(Toy toy) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE), StandardOpenOption.APPEND)) {

            CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                    .setHeader(HEADERS)
                    .setSkipHeaderRecord(true)
                    .build();

            CSVPrinter printer = new CSVPrinter(writer, csvFormat);
            printer.printRecord(toy.id, toy.name);
        }
    }
}
