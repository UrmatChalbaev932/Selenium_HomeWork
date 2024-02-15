import org.example.ui.entity.BookEntity;
import org.testng.annotations.Test;

import java.util.List;

public class BookStoreApplication extends BasePageTest {
    @Test (description = "Test", priority = 0)
    void Test (){
        openTheSite("https://demoqa.com/profile");
        List<BookEntity> books = BookEntity.getBookFromTable(driver);
        books.forEach(System.out::println);
    }
}
