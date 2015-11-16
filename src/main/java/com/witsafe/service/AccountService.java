package com.witsafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.witsafe.dao.dbo.MemberMapper;
import com.witsafe.model.dbo.Member;

@Service
public class AccountService {

	@Autowired
	private MemberMapper memberMapper;

	/**
	 * 查询用户
	 * 
	 * @param userId
	 *            用户id
	 * @return 用户详情
	 */
	public Member selectByPrimaryKey(String openid) {
		return memberMapper.selectByPrimaryKey(openid);
	}
	
	

}
