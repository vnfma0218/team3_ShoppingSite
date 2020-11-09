package kr.or.bit.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import kr.or.bit.model.DTO.MemberDTO;
import kr.or.bit.model.DTO.ProductDTO;
import kr.or.bit.utils.DB_Close;

public class ProductDAO {
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	DataSource ds = null;
	Connection conn = null;

	public ProductDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle");// java:comp/env/ + name
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 상품등록
	public int productAdd(ProductDTO product) throws Exception {
		String sql = "INSERT INTO  PRODUCT (p_num, sel_num, p_name, p_price, p_size, p_amount, p_description) " + "VALUES (?, ?, ?, ?, ?, ?, ?)";

		int result = 0;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getP_num());
			pstmt.setString(2, product.getSel_num());
			pstmt.setString(3, product.getP_name());
			pstmt.setString(4, product.getP_price());
			pstmt.setString(5, product.getP_size());
			pstmt.setString(6, product.getP_amount());
			pstmt.setString(7, product.getP_description());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("상품등록실패: " + e.getMessage());
		} finally {
			DB_Close.close(rs);
			DB_Close.close(pstmt);
			conn.close();
		}

		return result;
	}

	
	
	
	
	
	

	
	
}
