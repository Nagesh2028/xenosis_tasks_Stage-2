package org.task.assignment2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileHandling csvReader = new FileHandling();
        List<Details> detailsList = csvReader.readCSVFile("C:\\Users\\nages\\Downloads\\File.csv");

        for (Details details : detailsList) {
            System.out.println(details.toString());
        }
        
        JSONWriter jsonWriter = new JSONWriter();
        jsonWriter.writeJSONFile(detailsList, "output.json");
        System.out.println("CSV data has been successfully written to JSON file.");
    }
}

