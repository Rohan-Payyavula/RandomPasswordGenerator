import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVmaker {
    private static final String FILE_PATH = "PasswordManager.csv";
    private String string1;
    private String string2;
    private List<String[]> csvData;

    public CSVmaker(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
        this.csvData = new ArrayList<>();
    }

    public void initializeFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
                // Optionally, write a header or initial content
                bw.write("Column1,Column2");
                bw.newLine();
                System.out.println("CSV file created with headers.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("CSV file already exists.");
        }
    }

    public void readCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                csvData.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addRow() {
        String[] newRow = { string1, string2 };
        csvData.add(newRow);
    }

    public void writeCSV() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (String[] row : csvData) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayCSVData() {
        for (String[] row : csvData) {
            System.out.println(String.join(",", row));
        }
    }
}