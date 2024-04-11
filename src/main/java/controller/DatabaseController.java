package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.StringUtils;
import model.StudentModel;

public class DatabaseController {
	
	public Connection getConnection () throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/college_app";
		String user = "root";
		String pw ="";
		return DriverManager.getConnection(url, user, pw);
	}
	
	public int addStudent(StudentModel studentModel) {
		try(Connection con = getConnection()) {
			PreparedStatement st = con.prepareStatement(StringUtils.INSERT_STUDENT);
			
			st.setString(1,studentModel.getUsername());
			st.setString(2,studentModel.getFirstName());
			st.setString(3,studentModel.getLastName());
			st.setDate(4,Date.valueOf(studentModel.getDob()));
			st.setString(5,studentModel.getGender());
			st.setString(6,studentModel.getEmail());
			st.setString(7,studentModel.getContact());
			st.setString(8,studentModel.getSubject());
			st.setString(9,studentModel.getPassword());
			
			int result = st.executeUpdate();
			return result > 0 ? 1:0;
		}catch(SQLException | ClassNotFoundException ex ) {
			ex.printStackTrace();
			return -1;
		}
	}
	
	public int getStudentLogInInfo(String username, String password) {
		try(Connection con = getConnection()) {
			PreparedStatement st = con.prepareStatement(StringUtils.GET_LOGIN_STUDENT_INFO);
			st.setString(1, username);
			st.setString(1, password);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return 1;
			}else {
				return 0;
			}
			
		}catch(SQLException | ClassNotFoundException ex ) {
			ex.printStackTrace();
			return -1;
		}
	}
}