package kr.or.bit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kr.or.bit.model.DBManager;
import kr.or.bit.model.dto.DTOSalePost;

public class DAOSalePost {
	private static DBManager instance = DBManager.getInstance();
	
	private static final String SQL_SELECT_SALEPOSTS_BY_CATEGORY = "SELECT * FROM SALE_POST WHERE SALE_NUM = ?";
	private static final String SQL_SELECT_IMAGES_BY_SALE_NUM = "SELECT IMAGE_ADR FROM IMAGES WHERE SALE_NUM = ?";
	
	public static List<DTOSalePost> getSalePostListByCategory(int categoryNum){
		List<DTOSalePost> salePostList = new ArrayList<DTOSalePost>();
		Connection conn = null;
		PreparedStatement pstmt = null;
//		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		try {
			conn = instance.getConnection();
			pstmt = conn.prepareStatement(SQL_SELECT_SALEPOSTS_BY_CATEGORY);
			pstmt.setInt(1, categoryNum);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DTOSalePost salePost = DAOSalePost.setDTOSalePost(rs);
				pstmt = conn.prepareStatement(SQL_SELECT_IMAGES_BY_SALE_NUM);
				pstmt.setInt(1, salePost.getSaleNum());
				rs2 = pstmt.executeQuery();
				List<String> imageAddrs = new ArrayList<String>();
				while(rs2.next()) {
					String imageAdr = rs2.getString("IMAGE_ADR").trim();
					imageAddrs.add(imageAdr);
				}
				salePost.setImageAddrs(imageAddrs);
				salePostList.add(salePost);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			instance.freeConnection(conn, pstmt, rs);
			instance.freeConnection(rs2);
		}
		return salePostList;
	}
	
	private static DTOSalePost setDTOSalePost(ResultSet rs) throws SQLException {
		int saleNum = rs.getInt("SALE_NUM");
		int selNum = rs.getInt("SEL_NUM");
		int categoryNum = rs.getInt("CATEGORY_NUM");
		String saleTitle = rs.getString("SALE_TITLE").trim();
		String saleContent = rs.getString("SALE_CONTENT").trim();
		Date saleCreatedAt = rs.getDate("SALE_CREATED_AT");
		
		DTOSalePost salePost = new DTOSalePost(saleNum, selNum, categoryNum, saleTitle, saleContent, saleCreatedAt);
		return salePost;
	}
}
