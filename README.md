# Marc Hajjar (211764)

## JDBC Database Connection Project
### Step-by-Step Guide:

### Overview:
This project demonstrates the implementation of JDBC to establish a connection between a standalone Java application and a Microsoft SQL Server database using SQL Server Management Studio (SSMS). The steps below guide you through the setup and execution of the project.

### Database Info:

  Database: SampleDB
  JDBC Driver: Microsoft JDBC Driver for SQL Server
  Database JDBC URL: jdbc:sqlserver://predator\SQLEXPRESS:1433;databaseName=SampleDB;

### Project Setup:
  1.	Clone the repo : https://github.com/mh0712/Distributed-Computing.git
  2.	Download the JDBC driver:
    •	Download Microsoft JDBC Driver for SQL Server from : https://learn.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver16
    •	Place the JAR file from the Zip folder download in the “lib” folder of the java project.
  3.	Configure Build Path: 
    •	In Your IDE, add the JDBC driver JAR file to the build path.
  4.	Run the main.java file

#### N.B: 
Before running the application, configure your database connection credentials in the code (DB_JDBC_URL, DB_USERNAME, DB_PASSWORD).
