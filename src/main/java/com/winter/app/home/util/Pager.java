package com.winter.app.home.util;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Pager {
	
	//시작 번호
	private Long startNum;
	
	//가져올 갯수
	private Long perPage=10L;
	
	private Long page;
	
	public void makeNum() {
		this.startNum=(this.getPage()-1)*this.perPage;
	}

	
	public Long getStartNum() {
		if(this.startNum==null || this.startNum<0) {
			this.startNum=0L;
		}
		return startNum;
	}
	
	public Long getPage() {
		if(this.page==null || this.page<1) {
			this.page=1L;
		}
		
		return this.page;
	}
	
	
	
	
	
	
	

}
