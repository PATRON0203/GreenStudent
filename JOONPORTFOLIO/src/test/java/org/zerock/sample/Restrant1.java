package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restrant1 {
	@Autowired
	// Chef cher = new Chef();
	private Chef1 chef1;

	public Chef1 getChef1() {
		return chef1;
	}

	public void setChef1(Chef1 chef1) {
		this.chef1 = chef1;
	}


	
}
