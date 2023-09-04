package org.green.mapper;

import org.green.domain.MemberVO;

public interface MemberMapper {
				//userid를 읽어 온다.
	public MemberVO read(String userid);
}
