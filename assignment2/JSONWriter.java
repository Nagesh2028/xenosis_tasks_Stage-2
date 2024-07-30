package org.task.assignment2;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSONWriter {
    public void writeJSONFile(List<Details> detailsList, String filename) {
        JSONArray jsonArray = new JSONArray();
        for (Details details : detailsList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("Name", details.getName());
            jsonObject.put("Gender", details.getGender());
            jsonObject.put("Country", details.getCountry());
            jsonObject.put("Age", details.getAge());
            jsonArray.put(jsonObject);
        }
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(jsonArray.toString(4)); // Pretty print with 4-space indentation
        } catch (IOException e) {
            System.err.println("Error writing JSON file: " + e.getMessage());
        }
    }
}



