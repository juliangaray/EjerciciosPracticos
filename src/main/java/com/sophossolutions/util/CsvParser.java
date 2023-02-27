package com.sophossolutions.util;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;

public class CsvParser {
    
public static List<List<String>> readCSVFile(String filename) throws IOException {
    File file = new File(filename);
    String fileContents = FileUtils.readFileToString(file, "UTF-8");
    Reader reader = new StringReader(fileContents);
    CSVFormat format = CSVFormat.EXCEL;
    CSVParser parser = new CSVParser(reader, format);

    List<CSVRecord> records = parser.getRecords();
    List<List<String>> inputs = new ArrayList<List<String>>();

    for (CSVRecord record : records) {
        List<String> inputLine = new ArrayList<String>();
        for (int index = 0; index < record.size(); index++) {
            String value = record.get(index);
            inputLine.add(value);
        }
        inputs.add(inputLine);
    }
    parser.close();
    return inputs;
}
    
}
