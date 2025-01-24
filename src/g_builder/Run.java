package g_builder;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Run {

    public static void main(String[] args) {
        // Book.Builder 내부클래스를 생성
        Book book = new Book.Builder()
                .title("해리포터")
                .author("조앤롤링")
                .price(1000)
                .page(3000)
                .build();

        System.out.println(book);
    }
}
