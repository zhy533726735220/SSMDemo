package com.zhy.service;

import com.zhy.vo.Member;

import java.util.List;


public interface IMemberService {
	public boolean add(Member vo) throws Exception;

	public List<Member> split(String column, String keyWord, int currentPage, int lineSize) throws Exception;
}
