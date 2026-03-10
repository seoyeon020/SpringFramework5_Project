package mylab.notification.di.annot.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mylab.notification.di.annot.EmailNotificationService;
import mylab.notification.di.annot.NotificationManager;
import mylab.notification.di.annot.SmsNotificationService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = NotificationConfig.class)
public class NotificationConfigTest {
	
	@Autowired
	private NotificationManager notificationManager;
	
	@Test
	public void testNotificationManager() {
		// NotificationManager이 Not Null인지 검증
		assertNotNull(notificationManager, "NotificationManager가 주입되지 않았습니다.");
		
		//이메일 서비스 검증 
		EmailNotificationService emailService = (EmailNotificationService) notificationManager.getEmailService();
		assertNotNull(emailService, "EmailService가 주입되지 않았습니다.");
		assertEquals("smtp.gmail.com", emailService.getSmtpServer());
		assertEquals(587, emailService.getPort());
		
		//SMS 서비스 검증
		SmsNotificationService smsService = (SmsNotificationService) notificationManager.getSmsService();
		assertNotNull(smsService, "SmsService가 주입되지 않았습니다.");
		assertEquals("SKT", smsService.getProvider());
		
		//메서드 실행 
		notificationManager.sendNotificationByEmail("테스트 이메일");
		notificationManager.sendNotificationBySms("테스트 SMS");
	}

}
