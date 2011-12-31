package com.raghu.junitcxf;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.raghu.junitcxf.ChatWebService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext-test.xml" })
public abstract class AbstractApiTest {

	@Autowired
	@Qualifier("chatclient")
	protected ChatWebService proxy;
}
