package com.zhy.dao;

import java.util.List;
import java.util.Map;

import com.zhy.vo.Member;

public interface IMemberDAO {
	public boolean doCreate(Member vo);

//	public List<Member> findAllSplit(String column, String keyWord, Integer currentPage, Integer lineSize);
	public List<Member> findAllSplit(Map<String, Object> params);
}
