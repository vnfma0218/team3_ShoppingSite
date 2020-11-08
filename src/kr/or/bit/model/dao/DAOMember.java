package kr.or.bit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.or.bit.model.DBManager;
import kr.or.bit.model.dto.DTOMember;

public class DAOMember {
	private static DBManager instance = DBManager.getInstance();
	private static final String SQL_SELECT_MEMBER_BY_ID = "SELECT * FROM MEMBER WHERE ID = ?";
	
	public static DTOMember getMemberById(String id) {
		DTOMember member = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = instance.getConnection();
			pstmt = conn.prepareStatement(SQL_SELECT_MEMBER_BY_ID);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				member = setDTOMember(rs);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			instance.freeConnection(conn, pstmt, rs);
		}
		
		return member;
	}
	
	private static DTOMember setDTOMember(ResultSet rs) throws SQLException {
		String id = rs.getString("ID").trim();
		String pwd = rs.getString("PWD").trim();
		String name = rs.getString("NAME").trim();
		String hp = rs.getString("HP").trim();
		String cardNum = rs.getString("CARD_NUM").trim();
		String address = rs.getString("ADDRESS").trim();
		
		DTOMember member = new DTOMember(id, pwd, name, hp, cardNum, address);
		return member;
	}
}
