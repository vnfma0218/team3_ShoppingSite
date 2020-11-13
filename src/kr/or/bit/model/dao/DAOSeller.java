package kr.or.bit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.or.bit.model.DBManager;
import kr.or.bit.model.dto.DTOSeller;

public class DAOSeller {
	private static DBManager instance = DBManager.getInstance();
	
	private static final String SQL_SELECT_SELLER_BY_ID = "SELECT * FROM SELLER WHERE ID = ?";
	private static final String SQL_SELECT_SELLER_BY_SEL_NUM = "SELECT * FROM SELLER WHERE SEL_NUM = ?";
	
	public static DTOSeller ryu_getSellerById(String id) {
		DTOSeller seller = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = instance.getConnection();
			pstmt = conn.prepareStatement(SQL_SELECT_SELLER_BY_ID);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				seller = DAOSeller.setDTOSeller(rs);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			instance.freeConnection(conn, pstmt, rs);
		}
		
		return seller;
	}
	
	public static DTOSeller ryu_getSellerBySelNum(int selNum) {
		DTOSeller seller = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = instance.getConnection();
			pstmt = conn.prepareStatement(SQL_SELECT_SELLER_BY_SEL_NUM);
			pstmt.setInt(1, selNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				seller = DAOSeller.setDTOSeller(rs);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			instance.freeConnection(conn, pstmt, rs);
		}
		
		return seller;
	}
	
	private static DTOSeller setDTOSeller(ResultSet rs) throws SQLException {
		int selNum = rs.getInt("SEL_NUM");
		String id = rs.getString("ID");
		String selEmail = rs.getString("SEL_EMAIL");
		int selRegistNum = rs.getInt("SEL_REGIST_NUM");
		String selAccount = rs.getString("SEL_ACCOUNT");
		
		DTOSeller seller = new DTOSeller(selNum, id, selEmail, selRegistNum, selAccount);
		
		return seller;
	}
}
