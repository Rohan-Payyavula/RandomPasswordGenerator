# CSV and Password Manager

This project is a simple utility for managing passwords and storing them securely in a CSV file. It includes classes for generating passwords, managing the CSV file, and providing a command-line interface for user interaction.

## Features

- **Password Generation**: Create strong, random passwords with a customizable length.
- **CSV Management**: Store and retrieve password entries in a CSV file, ensuring data is organized and easily accessible.
- **Command-line Interface**: Interact with the application through a simple and intuitive CLI.

## Classes

### 1. `CSVmaker`
- **Purpose**: Manages the reading and writing of password data to and from a CSV file.
- **Methods**:
  - `readCSV()`: Reads existing data from the CSV file.
  - `addRow(String[] newRow)`: Adds a new row of data to the CSV.
  - `writeCSV()`: Writes updated data back to the CSV file.
  - `initializeFile()`: Checks if the CSV file exists; if not, creates it with an optional header.
  - `displayCSVData()`: Displays the contents of the CSV file (for debugging or verification).

### 2. `PasswordGenerator`
- **Purpose**: Generates secure passwords.
- **Methods**:
  - `generatePassword(int length)`: Generates a random password of the specified length using a mix of characters.

### 3. `Main`
- **Purpose**: Main class to run the application, integrating CSV management and password generation functionalities.
- **Methods**:
  - `main(String[] args)`: Entry point for the application.

## Usage

1. **Setup**: Ensure you have Java installed on your machine. Compile the Java files if necessary.
2. **Running the Application**: Use the command line to run the `Main` class. You can specify options for generating passwords or managing CSV entries.

```bash
java Main
