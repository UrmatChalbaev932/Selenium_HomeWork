package org.example.ui.entity;

import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BookEntity {
    private String image;
    private String title;
    private String author;
    private String publish;

    public static ArrayList<BookEntity> getBookFromTable(WebDriver driver) {
        ArrayList<BookEntity> books = new ArrayList<>();
        List<WebElement> rows = driver.findElements(By.cssSelector(".ReactTable  .rt-tr-group")); // создали list для хранения строк из веб страницы
        for (WebElement row : rows) { //перебираем каждую строку
            List<WebElement> cells = driver.findElements(By.cssSelector("rt-td")); // создали list для хранения ячеек каждой строки
            String image = cells.get(0).getText(); // инициализируем наши переменные
            String title = cells.get(0).getText();
            String author = cells.get(0).getText();
            String publish = cells.get(0).getText();
            if (
                    image.isEmpty() || // проверяем а иницилаизированая переменная не пустая если пустая то через continue пропускаем данный цикл;
                    title.isEmpty() ||
                    author.isEmpty() ||
                    publish.isEmpty()
            ) {
                continue; // пропускаем цикл;
            }
            books.add(new BookEntity(image, title, author, publish)); // заполнили нал список books -> при каждом круге заполняет наш список новыми инициализированными книгами
        }
        return books; // возвращает наш забитый книгами список
    }

}
