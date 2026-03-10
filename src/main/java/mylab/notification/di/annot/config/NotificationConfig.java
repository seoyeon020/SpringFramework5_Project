package mylab.notification.di.annot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mylab.notification.di.annot.EmailNotificationService;
import mylab.notification.di.annot.NotificationManager;
import mylab.notification.di.annot.NotificationService;
import mylab.notification.di.annot.SmsNotificationService;

@Configuration
public class NotificationConfig {
	
	@Bean //이메일 서비스 빈 등록
	public NotificationService emailNotificationService() {
		return new EmailNotificationService("smtp.gmail.com", 587);
	}
	
	@Bean //SMS 서비스 빈 등록
	public NotificationService smsNotificationService() {
		return new SmsNotificationService("SKT");
	}
	
	@Bean //알림 관리자 빈 등록
	public NotificationManager notificationManager() {
		return new NotificationManager(emailNotificationService(), smsNotificationService());
		
	}

}
