import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PeriodicTable {

    static Connection conn;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        connectToDatabase();

        int option;
        do {
            option = getOption(scanner);
            switch (option) {
                case 1:
                    searchByAtomicNumber(scanner);
                    break;
                case 2:
                    searchBySymbol(scanner);
                    break;
                case 3:
                    searchByName(scanner);
                    break;
                case 4:
                    searchByWeight(scanner);
                    break;
                case 5:
                    closeConnection();
                    return;
                default:
                    System.out.println("\nWrong Choice! Let's try again.\n");
            }
        } while (option != 5);
    }

    static void connectToDatabase() {
        try {
            // Connect to MySQL database
            String url = "jdbc:mysql://localhost:3306/periodic_table_db";
            String user = "root";
            String password = "your_password";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static int getOption(Scanner scanner) {
        System.out.println("\nEnter the corresponding number:");
        System.out.println("1. Search by ATOMIC NUMBER");
        System.out.println("2. Search by ATOMIC SYMBOL");
        System.out.println("3. Search by ATOMIC NAME");
        System.out.println("4. Search by ATOMIC WEIGHT");
        System.out.println("5. QUIT");
        System.out.print("Enter Your Choice: ");
        return scanner.nextInt();
    }

    static void searchByAtomicNumber(Scanner scanner) {
        System.out.print("Enter the Atomic Number: ");
        int atomicNumber = scanner.nextInt();
        String query = "SELECT * FROM elements WHERE atomic_number = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, atomicNumber);
            displayResult(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void searchBySymbol(Scanner scanner) {
        System.out.print("Enter the Atomic Symbol: ");
        String symbol = scanner.next();
        String query = "SELECT * FROM elements WHERE symbol = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, symbol);
            displayResult(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void searchByName(Scanner scanner) {
        System.out.print("Enter the Atomic Name: ");
        String name = scanner.next();
        String query = "SELECT * FROM elements WHERE name = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            displayResult(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void searchByWeight(Scanner scanner) {
        System.out.print("Enter the Atomic Weight: ");
        double weight = scanner.nextDouble();
        String query = "SELECT * FROM elements WHERE weight = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, weight);
            displayResult(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void displayResult(PreparedStatement stmt) throws SQLException {
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            System.out.println("\nElement Found:");
            System.out.println("Atomic Number: " + rs.getInt("atomic_number"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Symbol: " + rs.getString("symbol"));
            System.out.println("Weight: " + rs.getDouble("weight"));
            System.out.println("Block: " + rs.getString("block"));
            System.out.println("Property: " + rs.getString("property"));
        } else {
            System.out.println("No element found with the given criteria.");
        }
    }
}
