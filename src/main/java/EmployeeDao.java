import sun.tools.java.ClassNotFound;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class EmployeeDao {

	public int registerEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		String INSERT_USER_SQL = "INSERT INTO employee" +
				"(id, first_name, last_name, username, password, address, contact) VALUES " +
				"(?, ?, ?, ?, ?, ?, ?); ";
				int result = 0;
				Class.forName("com.mysql.jdbc.Driver");

				try (Connection connection = DriverManager.getConnection(
							 "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
							 "root",
							 "codeup"
					 );

					 PreparedStatement preparedStatement =connection.prepareStatement(INSERT_USER_SQL)

				return result;
	}
}
