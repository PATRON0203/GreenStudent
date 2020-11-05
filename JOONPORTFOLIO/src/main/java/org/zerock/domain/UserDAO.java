package org.zerock.domain;

public interface UserDAO {
	
	// 회원가입
	public void register(UserVO vo) throws Exception;
}