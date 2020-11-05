package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 @Autowired
	 private TimeMapper timeMapper;
	 
	 @Test
	 public void testGetTime() {
		 logger.info(timeMapper.getClass().getName());
		 logger.info("TimeMapper에 있는 getTime 결과= "+timeMapper.getTime());
	 }
	 
	 @Test
	 public void testGetTime2() {
		 logger.info("getTime2");
		 logger.info("TimeMapper에 있는 getTime2 결과= "+timeMapper.getTime2());
	 }
}
