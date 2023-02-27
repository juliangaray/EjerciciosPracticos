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

    private static File file;
    private static int index;
    private static String fileContents, value;
    private static Reader reader;
    private static CSVFormat format;
    private static CSVParser parser;
    private static List<CSVRecord> records;
    private static List<List<String>> inputs;
    private static List<String> inputLine;
    
public static List<List<String>> readCSVFile(String filename){
    

    try {
        file = new File(filename);
        fileContents = FileUtils.readFileToString(file, "UTF-8");
        reader = new StringReader(fileContents);
        format = CSVFormat.EXCEL;
        parser = new CSVParser(reader, format);
    
        records = parser.getRecords();
        inputs = new ArrayList<List<String>>();
    
        for (CSVRecord record : records) {
            inputLine = new ArrayList<String>();
            for (index = 0; index < record.size(); index++) {
                value = record.get(index);
                inputLine.add(value);
            }
            inputs.add(inputLine);
        }
        parser.close();        
    } catch (IOException e) {
         e.printStackTrace();
    }  
    return inputs;
}    
}
