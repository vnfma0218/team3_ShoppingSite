package kr.or.bit.shoppingMall.Model;

import kr.or.bit.shoppingMall.Utils.ConnectionPoolHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
    private static ConnectionPoolHelper instance = ConnectionPoolHelper.getInstance();
    private static final String DELETE_MEMBER_QUERY ="UPDATE MEMBER SET DELFLAG = 'Y' WHERE ID = ?";
    //query문은 따로 클래스로 만들어서 관리
    private static DAO dao;
    //싱글톤 패턴
    public DAO() {}
    public static DAO getInstance() {
        if (dao == null)
            dao = new DAO();
        return dao;
    }

        //회원탈퇴
        public static int deleteMember(String id){
        int resultRow = 0;
            Connection conn = null;
            PreparedStatement pstmt = null;
            try {
                conn = instance.getConnection();
                pstmt = conn.prepareStatement(DELETE_MEMBER_QUERY);
                pstmt.setString(1,id);

                resultRow = pstmt.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                instance.freeConnection(conn,pstmt);
            }
            return resultRow;

        }
    }



