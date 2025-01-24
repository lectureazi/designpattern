package g_builder;

public class Book {
    private String title;
    private String author;
    private int page;
    private int price;

    public Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.page = builder.page;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                ", price=" + price +
                '}';
    }

    // 점층적 생성자 패턴
    // Book book = new Book("해리포터", "조앤롤링", 1000, 1000);
    // 단점 : 생성자 매개변수로 전달하는 인자 값들의 의미를 알기가 번거롭다.

    // 자바빈패턴
    // 기본생성자  + 모든 속성 getter/setter
    // Book book = new Book()
    // book.setPrice(1000) => 객체의 초기화가 setter를 통해서 이루어지기 때문에 의미가 명확하다.
    // 단점 : immutable한 객체를 생성할 수 없다.
    // mutable      : 객체를 생성한 이후 속성을 수정할 수 있는 객체
    // immutable    : 객체를 생성한 이후 속성을 수정할 수 없는 객체, String

    // builder
    public static class Builder{
        private String title;
        private String author;
        private int page;
        private int price;

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder author(String author){
            this.author = author;
            return this;
        }

        public Builder page(int page){
            this.page = page;
            return this;
        }

        public Builder price(int price){
            this.price = price;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
