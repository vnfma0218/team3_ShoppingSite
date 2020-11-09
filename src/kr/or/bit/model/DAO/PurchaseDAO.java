package kr.or.bit.model.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import kr.or.bit.model.DTO.MemberDTO;
import kr.or.bit.model.DTO.ProductDTO;
import kr.or.bit.model.DTO.PurchaseDTO;
import kr.or.bit.utils.DB_Close;

public class PurchaseDAO {
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	DataSource ds = null;
	Connection conn = null;

	public PurchaseDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle");// java:comp/env/ + name
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 상품주문
	public int purchase(PurchaseDTO purchase) throws Exception {
		String sql = "INSERT INTO  PURCHASE (o_num, id, p_num, o_amount, o_created_at) " + "VALUES (?, ?, ?, ?, ?)";

		int result = 0;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, purchase.getoNum());
			pstmt.setString(2, purchase.getId());
			pstmt.setString(3, purchase.getpNum());
			pstmt.setString(4, purchase.getoAmount());
			pstmt.setString(5,purchase.getoCreatedAt());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("주문실패: " + e.getMessage());
		} finally {
			DB_Close.close(rs);
			DB_Close.close(pstmt);
			conn.close();
		}

		return result;
	}
	
	
	
	
	
	

	
	
}
