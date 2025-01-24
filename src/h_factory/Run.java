package h_factory;

import java.util.Calendar;
import java.util.random.RandomGeneratorFactory;

public class Run {
    public static void main(String[] args) {
        // 다음 SMTP서버에 연결해보자!
        ConnectorFactory.createSMTPConnector(EmailConfig.DAUM).connect();
    }
}
