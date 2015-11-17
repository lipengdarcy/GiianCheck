package com.witsafe.model.dbo.ext;

import com.witsafe.model.dbo.Member;
import com.witsafe.model.dbo.ProjectStep;


public class ProjectStepExt extends ProjectStep{
	
	private Member member;

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
   
}