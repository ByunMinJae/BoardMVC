package controllerUser;

import java.io.IOException;

import dto.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.face.UserService;
import service.impl.UserServiceImpl;

@WebServlet("/board/join")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService = new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("JoinController /board/join doGet() - Start!");
		
		req.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("JoinController /board/join doPost() - Start!");
		
		//User 정보 객체
		User user = userService.getParam(req);
		int next = userService.getNext();
		System.out.println("현재 시퀀스 : " + next);
		
		user.setUserno(next);
		System.out.println(user);
		
		
		
	}
	
}
