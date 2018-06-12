package com.areuman.bbs;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*.xml")
public class ControllerTest {

	public static final String TAG = "ControllerTest";

	Logger logger = LoggerFactory.getLogger(ControllerTest.class);

	@Inject
	private WebApplicationContext webApplicationContext;
	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testController() {
		logger.info(TAG, mockMvc);
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/fhgfgh"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
