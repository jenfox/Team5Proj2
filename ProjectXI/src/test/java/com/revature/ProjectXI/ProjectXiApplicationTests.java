package com.revature.ProjectXI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectXiApplicationTests {
	/**
	 * 
	 * @Autowired private MockRestServiceServer server;
	 * 
	 * @Autowired private FrontController frontController;
	 * 
	 * @Autowired private ObjectMapper objectMapper;
	 * 
	 * @Before public void setUp() throws Exception { String detailsString =
	 *         objectMapper.writeValueAsString(new User("John Smith", "john"));
	 * 
	 *         this.server.expect(requestTo("/john/details"))
	 *         .andRespond(withSuccess(detailsString, MediaType.APPLICATION_JSON));
	 *         }
	 * 
	 * @Test public void whenCallingGetUserDetails_thenClientMakesCorrectCall()
	 *       throws Exception {
	 * 
	 *       ResponseEntity details = this.frontController.getUser("john", "smith");
	 * 
	 *       assertThat(details.getBody()).isEqualTo("john"); }
	 */

	@Test
	public void contextLoads() {
	}

}
