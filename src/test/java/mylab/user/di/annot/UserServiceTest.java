package mylab.user.di.annot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:mylab-user-di.xml")
public class UserServiceTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void testUserService() {
		//UserService가 Not Null인지 검증
		assertNotNull(userService, "UserService는 주입되어야 합니다.");
		
		//UserRepository가 Not Null인지 검증
		assertNotNull(userService.getUserRepository(), "UserRepository는 주입되어야 합니다.");
		
		//dbType이 MySQL인지 검증
		assertEquals("MySQL", userService.getUserRepository().getDbType());
		
		//SecurityService가 Not Null인지 검증
		assertNotNull(userService.getSecurityService(), "SecurityService는 주입되어야 합니다.");
		
		//registerUser 메서드가 True인지 검증
		boolean result = userService.registerUser("user01", "홍길동", "1234");
		assertTrue(result, "사용자 등록은 성공해야 합니다.");
	
	}

}
