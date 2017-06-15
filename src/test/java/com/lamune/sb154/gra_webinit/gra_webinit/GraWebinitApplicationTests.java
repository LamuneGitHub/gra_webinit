package com.lamune.sb154.gra_webinit.gra_webinit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class) //:TODO(Lamune): SpringJUnit4ClassRunner.class 가 아닌가? 책에는 ...
@SpringBootConfiguration() //:TODO(Lamune): Jnunit 실행시 에러가 나서 추가 하였음 classes=GraWebinitApplication.class
@SpringBootTest
@WebAppConfiguration //:TODO(Lamune): 추가
public class GraWebinitApplicationTests {

	@Test
	public void contextLoads() {
	}

}
