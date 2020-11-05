package org.zerock.service;

import javax.inject.Inject;

import org.zerock.domain.UserDAO;
import org.zerock.domain.UserVO;

public class UserServiceImpl implements UserService {
	
	@Inject UserDAO dao;
	
	@Override
	public void register(UserVO vo) throws Exception {
		
		dao.register(vo);
		
	}
	
}