package com.witsafe.model.dbo.ext;

import com.witsafe.model.dbo.Member;
import com.witsafe.model.dbo.ProjectResult;


public class ProjectResultExt extends ProjectResult{
	private Member member;

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	
   
}