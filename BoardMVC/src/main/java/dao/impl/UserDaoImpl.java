package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JDBCTemplate;
import dao.face.UserDao;

public class UserDaoImpl implements UserDao {
	
	PreparedStatement ps;
	ResultSet rs;
	
	@Override
	public int getNextval(Connection conn) {
		
		int nextval = 0;
		
		String sql = "SELECT usertb_seq.nextval FROM dual";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			rs.next();
			
			nextval = rs.getInt("nextval");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(ps);
		}
		
		return nextval;
	}


}
