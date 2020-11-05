package org.zerock.domain;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public class UserDAOImpl implements UserDAO {
	
	@Inject SqlSession sql;
	// 회원가입

	@Override
	public void register(UserVO vo) throws Exception {
		sql.insert("memberMapper.register", vo);
	}
}