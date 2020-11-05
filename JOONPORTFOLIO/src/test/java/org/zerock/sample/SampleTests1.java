package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class SampleTests1 {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Restrant1 restaurant1;
	
	@Test
	public void testExist() {
		assertNotNull(restaurant1);	
		
		logger.info("restaurant1= "+restaurant1);
		logger.info("--------------");
		logger.info("restaurant.getChef()= "+restaurant1.getChef1());
	}
}
