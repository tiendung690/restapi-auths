package com.mkdika.springrestapiauths.digestauth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DigestauthApplication.class)
public class DigestauthApplicationTests {

	@Test
	public void contextLoads() {
		DigestauthApplication.main(new String[]{});
	}
}
