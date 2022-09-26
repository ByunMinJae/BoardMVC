package dao.face;

import java.sql.Connection;

public interface UserDao {
	
	/**
	 * 현재 시퀀스 값 구하기 
	 * 
	 * @param conn - DB 연결 객체 
	 * @return usertb_seq의 nextval()
	 */
	public int getNextval(Connection conn);
	
	

}
