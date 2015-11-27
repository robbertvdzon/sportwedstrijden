package com.vdzon.msw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmailServiceApplication.class)
@WebAppConfiguration
public class Msw2ApplicationIT {

	@Test
	public void contextLoads() {
	}

}
