package service.impl;

import java.sql.Connection;

import common.JDBCTemplate;
import dao.face.UserDao;
import dao.impl.UserDaoImpl;
import dto.User;
import jakarta.servlet.http.HttpServletRequest;
import service.face.UserService;

public class UserServiceImpl implements UserService {
	
	UserDao userDao = new UserDaoImpl();
	
	@Override
	public User getParam(HttpServletRequest req) {
		
		User user = new User();
		
		user.setUserid(req.getParameter("userid"));
		user.setUserpw(req.getParameter("userpw"));
		user.setEmail(req.getParameter("email"));
		
		return user;
	}

	@Override
	public int getNext() {
		
		Connection conn = JDBCTemplate.getConnection();
		
		int nextval = userDao.getNextval(conn);
		
		return nextval;
	}

}
