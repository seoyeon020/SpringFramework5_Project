package mylab.notification.di.annot;

public class EmailNotificationService implements NotificationService {
	//이메일 알림을 전송하는 기능 
	private String smtpServer; //SMTP 서버 주소 
    private int port; //포트 번호 
    
    public EmailNotificationService(String smtpServer, int port) {
        this.smtpServer = smtpServer;
        this.port = port;
    }
    
    public String getSmtpServer() { return smtpServer; }
    public int getPort() { return port; }
    
    @Override
    public void sendNotification(String message) {
        System.out.println("이메일 알림 전송: " + message + " (서버: " + smtpServer + ":" + port + ")");
    }

}
