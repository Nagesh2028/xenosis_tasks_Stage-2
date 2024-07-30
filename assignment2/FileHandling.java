package org.task.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {
    public List<Details> readCSVFile(String filename) {
        List<Details> detailsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 4) {
                    try {
                        Details details = new Details(values[0], values[1], values[2], Integer.parseInt(values[3]));
                        detailsList.add(details);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid age format for line: " + line);
                    }
                } else {
                    System.err.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
        return detailsList;
    }
}

