package service.face;

import dto.User;
import jakarta.servlet.http.HttpServletRequest;

public interface UserService {
	
	/**
	 *  입력받은 회원가입 정보를 User DTO 객체에 담는다
	 * 
	 * @param req - 회원가입 정보
	 * @return 반환 받은 User DTO 객체
	 */
	public User getParam(HttpServletRequest req);
	
	/**
	 * 현재 시퀀스 값을 구한다
	 * 
	 * @return usertb_seq의 nextval()값
	 */
	public int getNext();

}
