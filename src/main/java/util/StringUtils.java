package util;

public class StringUtils {
    // Start SQL Queries
    public static final String INSERT_STUDENT = "INSERT INTO student_info"
            + " (user_name, first_name, last_name, dob, gender, email, phone_number, subject, password) "
            + "VALUES(?,?,?,?,?,?,?,?,?)";

    public static final String GET_LOGIN_STUDENT_INFO = "SELECT user_name, password FROM student_info";
    // End SQL Queries

    // Start messages
    // End messages
}
