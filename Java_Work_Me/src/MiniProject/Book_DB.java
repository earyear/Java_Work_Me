package MiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Book_DB {

	// 연결을 위한 준비물.
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";																		// 변수에 저장.
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERID = "scott";
	private static final String PASSWORD = "tiger";
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public static Connection getConn() {
		Connection con = null;

		try {
			Class.forName(DRIVER); // 1. 드라이버 로딩
			con = DriverManager.getConnection(URL, USERID, PASSWORD); // 2. 드라이버 연결

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;

	}


	// 삽입
	public void insertbook(BookDTO vo) {

		try {
			con = getConn();

			String insertsql = "INSERT INTO BOOK(BOOKID,BOOKNAME,PUBLISH,AUTHOR,PRICE,BOOKCATE)" + "VALUES(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(insertsql);

			pstmt.setInt(1, vo.getBookid());
			pstmt.setString(2, vo.getBookName());
			pstmt.setString(3, vo.getPublish());
			pstmt.setString(4, vo.getAuthor());
			pstmt.setInt(5, vo.getPrice());
			pstmt.setString(6, vo.getCategory());
			
			int n = pstmt.executeUpdate();

			System.out.println(n + "개의 레코드가 저장");
			// 반환된 정수값을 출력하면 SQL 문을 실행한 뒤에 데이터베이스에 적용된
			// 레코드의 개수를 알수 있다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

//
//	// 조회
//	public String selectMember() {
//
//		StringBuffer stringBuffer = new StringBuffer();
//		try {
//			con = getConn();
//
//			String query = "SELECT * FROM BOOK";
//			pstmt = con.prepareStatement(query);
//
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				int id = rs.getInt("BOOKID");
//				String name = rs.getString("bookname");
//				String publish = rs.getString("publish");
//				String author = rs.getString("author");
//				int price = rs.getInt("price");
//				String bookcate = rs.getString("bookcate");
//
//				stringBuffer.append("아이디 : " + id + ", 이름 : " + name + ", 이메일 : " + email + ", 비밀번호: " + pw + "\n");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return stringBuffer.toString();
//	}
////
//	// 수정
//	public void updateMember(String id, String name, String email, String pw) {
//
//		try {
//			Class.forName(driver);			
//			con = DriverManager.getConnection(url, userid, passwd);
//
//			String sql = "UPDATE member501 SET name = ? , email = ?, pw = ? WHERE id = ?";
//			
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, name);
//			pstmt.setString(2, email);
//			pstmt.setString(3, pw);
//			pstmt.setString(4, id);
//			
//			
//			int n = pstmt.executeUpdate();
//			
//			System.out.println(n + "개의 레코드가 수정");
//			
//
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//
//	}
//	
	// 삭제
//	public void deleteMember(String id) {
//		try {
//			Class.forName(driver);
//			
//			con = DriverManager.getConnection(url, userid, passwd);
//
//			String sql = "DELETE FROM member501 WHERE id = ?";
//			
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, id);
//			
//			int n = pstmt.executeUpdate();
//			
//			System.out.println(n + "개의 레코드가 삭제");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//				// 사용한 자원을 finally 문을 이용해서 반납한다.
//				// 자원 반납은 사용했던 객체의 역순으로 하며 모두 공통적으로
//				// close() 메소드를 사용한다.
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}

}
