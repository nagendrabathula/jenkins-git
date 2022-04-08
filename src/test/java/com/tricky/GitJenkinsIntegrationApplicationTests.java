package com.tricky;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitJenkinsIntegrationApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(GitJenkinsIntegrationApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test Case Executed....");
		assertEquals(true, true);
	}

}
