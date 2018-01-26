package com.zhy.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.zhy.dao.IMemberDAO;
import com.zhy.service.IMemberService;
import com.zhy.vo.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements IMemberService {
	@Resource
	private IMemberDAO memberDAO;

	@Override
	public boolean add(Member vo) throws Exception {
		return this.memberDAO.doCreate(vo);
	}

	@Override
	public List<Member> split(String column, String keyWord, int currentPage, int lineSize) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("column", column);
		map.put("keyWord", keyWord);
		map.put("start", (currentPage - 1) * lineSize);
		map.put("lineSize", lineSize);
		return this.memberDAO.findAllSplit(map);

	}

}
