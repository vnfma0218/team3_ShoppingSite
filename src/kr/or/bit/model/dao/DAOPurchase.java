package kr.or.bit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.or.bit.model.DBManager;
import kr.or.bit.model.dto.DTOPurchase;

public class DAOPurchase {
	private static DBManager instance = DBManager.getInstance();
	
	private static final String SQL_INSERT_INTO_PURCHASE = "INSERT INTO PURCHASE(ID, P_NUM, O_AMOUNT) "
															+ "VALUES(?, ?, ?)";
	
	public static int insertPurchase(DTOPurchase purchase) {
		int resultRow = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = instance.getConnection();
			pstmt = conn.prepareStatement(SQL_INSERT_INTO_PURCHASE);
			pstmt.setString(1, purchase.getId());
			pstmt.setInt(2, purchase.getpNum());
			pstmt.setInt(3, purchase.getoAmount());
			
			resultRow = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			instance.freeConnection(conn, pstmt);
		}
		
		return resultRow;
	}
}
