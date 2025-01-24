package h_factory;

public class GoogleMail implements SMTPConnector{

    private final EmailConfig config;

    public GoogleMail(EmailConfig config) {
        this.config = config;
    }

    public EmailConfig getConfig() {
        return config;
    }

    @Override
    public void connect() {
        System.out.println("구글 SMTP서버에 연결되었습니다.");
    }
}
