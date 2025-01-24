package h_factory;

public class NaverMail implements SMTPConnector{

    private final EmailConfig config;
    
    public NaverMail(EmailConfig config) {
        this.config = config;
    }

    public EmailConfig getConfig() {
        return config;
    }

    @Override
    public void connect() {
        System.out.println("네이버 SMTP서버에 연결되었습니다.");
    }
}
