package com.practice;

/*7 Steps to Connect Application to database
*Import the package
*Load and Register driver
*Create Connection
*Create Statement
Execute the query
*process the results
*close connection
*/

import java.sql.*;

public class Retrieve_DetailsFromTable {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/database1";
		String uname = "root";
		String password = "Lakshmi@2";
		String query = "SELECT Username from .employee_table where emp_id=103";

		// Step 2: loading and registering the driver
		// registering the driver with forName method
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Step 3: establishing the connection with interface "Connection"

		Statement st = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, uname, password);

			// Step 4: creating the statement
			st = con.createStatement();

			// Step 5: execute the query
			ResultSet rs = st.executeQuery(query);

			// Step 6:processing the results
			rs.next();
			String name = rs.getString("first name");
			int age = rs.getInt("age");
			String department = rs.getString("emp_department");
			System.out.println(name);
			System.out.println(age);
			System.out.println(department);

		} catch (SQLException exception) {
			System.out.println(exception);
		}
		// Step 7: close
		finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
