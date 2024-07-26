import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator PG = new PasswordGenerator(10);
        Scanner scanner = new Scanner(System.in);
        String webName = scanner.next();
        String password = PG.generatePassword();
        System.out.println(password);
        CSVmaker cm = new CSVmaker(webName, password);
        cm.readCSV();
        cm.displayCSVData();
        cm.addRow();
        cm.writeCSV();
        System.out.println("Strings added to the CSV file successfully.");
    }
}