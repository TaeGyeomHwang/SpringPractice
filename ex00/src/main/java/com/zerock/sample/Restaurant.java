package com.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	//	수정자 주입(롬복)
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
	
	//	수정자 주입
//	@Autowired
//	public void setChef(Chef chef) {
//		this.chef = chef;
//	}
	
	//생성자 주입(묵시적)
	public Restaurant(Chef chef) {
		this.chef = chef;
	}
}
