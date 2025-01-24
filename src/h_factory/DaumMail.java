package h_factory;

public class DaumMail implements SMTPConnector{

    private final EmailConfig config;

    public DaumMail(EmailConfig config) {
        this.config = config;
    }

    public EmailConfig getConfig() {
        return config;
    }

    @Override
    public void connect() {
        System.out.println("다음 SMTP서버에 연결되었습니다.");
    }
}
