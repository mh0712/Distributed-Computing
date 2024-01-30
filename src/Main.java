import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String jdbcUrl = "jdbc:sqlserver://predator\\SQLEXPRESS:1433;databaseName=SampleDB";
            String username = "sa";
            String password = System.getenv("db_name");

            jdbcUrl = jdbcUrl + ";trustServerCertificate=true";

            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            String sqlQuery = "SELECT * FROM Employee";

            try (PreparedStatement statement = connection.prepareStatement(sqlQuery);
                 ResultSet resultSet = statement.executeQuery()) {

                // Process the results
                while (resultSet.next()) {
                    int employeeId = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    double salary = resultSet.getDouble("Salary");

                    System.out.println("EmployeeID: " + employeeId +
                            ", Name: " + name + " " +
                            ", Salary: " + salary);
                }
            }

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("JDBC driver not found. Make sure it is in the classpath.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
