import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Absenece {

	void update() {
		LinkedList<Integer> classList;
		LinkedList<Integer> enrollment;
		LinkedList<Integer> attendence = new LinkedList<Integer>();
		classList = getClassList();
		for (int classID : classList) {
			enrollment = getenrollment(classID);
			classList = getAttendence(classID);

			// remove students that were in attendence
			for (int studentID : attendence) {
				enrollment.remove(studentID);
			}

			// at this point, studentList contains only absent students for current classID
			for (int studentID : enrollment) {
				insertAbsence(classID, studentID);
			}
		}
	}

	// Inserts new row into ABSENCERECORDS table for the indicated student and class

	void insertAbsence(int classID, int studentID) {
		try {
			Connection connection = createConnection();
			if (connection == null) {
				System.out.println("ERROR: Connection Failed");
			} else {
				System.out.println("Succesfully Connected to DB");
			}
			String query = "INSERT INTO ABSENCERECORDS(RECORD_STUDENTID, RECORD_CLASSID, RECORD_DATE) VALUES (?,?, CURDATE())";
			PreparedStatement stat = connection.prepareStatement(query);
			stat.setInt(1, classID);
			stat.setInt(2, studentID);
			stat.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	// Returns a list classes that met today
	LinkedList<Integer> getClassList() {
		LinkedList<Integer> classList = new LinkedList<Integer>();
		String curDay = getDay();
		try {
			Connection connection = createConnection();
			if (connection == null) {
				System.out.println("ERROR: Connection Failed");
			} else {
				System.out.println("Succesfully Connected to DB");
			}

			String query = "SELECT CLASSID FROM CLASS WHERE CLASSDAYS LIKE %?%";
			PreparedStatement stat = connection.prepareStatement(query);
			stat.setString(1, curDay);
			ResultSet rs = stat.executeQuery();

			while (rs.next()) {
				classList.add(rs.getInt(1));
			}
			rs.close();
			stat.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return classList;

	}

	String getDay() {
		String day = LocalDate.now().getDayOfWeek().name();
		if (day.toLowerCase().equals("thursday")) {
			return "u";
		}
		return "" + day.charAt(0);
	}

	// Returns a list of students enrolled in the specified class
	LinkedList<Integer> getenrollment(int classID) {
		LinkedList<Integer> enrollment = new LinkedList<Integer>();
		try {
			Connection connection = createConnection();
			if (connection == null) {
				System.out.println("ERROR: Connection Failed");
			} else {
				System.out.println("Succesfully Connected to DB");
			}

			String query = "SELECT STUDENTID FROM ENROLLMENT WHERE CLASSID = ?";
			PreparedStatement stat = connection.prepareStatement(query);
			stat.setInt(1, classID);
			ResultSet rs = stat.executeQuery();

			while (rs.next()) {
				enrollment.add(rs.getInt(1));
			}
			rs.close();
			stat.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return enrollment;
	}

	// Returns a list of students who have attendence records TODAY for the
	// specified class
	LinkedList<Integer> getAttendence(int classID) {
		LinkedList<Integer> attendence = new LinkedList<Integer>();
		try {
			Connection connection = createConnection();
			if (connection == null) {
				System.out.println("ERROR: Connection Failed");
			} else {
				System.out.println("Succesfully Connected to DB");
			}

			String query = "SELECT RECORD_STUDENTID FROM ATTENDENCERECORDS WHERE CLASSID = ? AND WHERE DATE = CURDATE()";
			PreparedStatement stat = connection.prepareStatement(query);
			stat.setInt(1, classID);
			ResultSet rs = stat.executeQuery();

			while (rs.next()) {
				attendence.add(rs.getInt(1));
			}

			rs.close();
			stat.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return attendence;
	}

	private static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://74.117.171.123:3306/CAPSTONE", "uacapstone", "UAcapstone4");
			return con;
		} catch (SQLException ex) {
			Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public static void main(String[] args) {
		Absenece a = new Absenece();
		Timer timer = new Timer();
		TimerTask tt = new TimerTask() {
			public void run() {
				Calendar cal = Calendar.getInstance(); // this is the method you should use, not the Date(), because it
														// is desperated.

				int hour = cal.get(Calendar.HOUR_OF_DAY);// get the hour number of the day, from 0 to 23
				int min = cal.get(Calendar.MINUTE);
				if ((hour ==22  ) && (min == 30)) {
					a.update();
				}
			}
		};
		timer.schedule(tt, 1000, 1000 * 86400);// delay the task 1 second, and then run task every five seconds
	}

}
