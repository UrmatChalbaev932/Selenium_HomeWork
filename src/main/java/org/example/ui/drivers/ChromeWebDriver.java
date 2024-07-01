package org.example.ui.drivers;

import org.example.ui.config.ConfigReader;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {
    public static WebDriver loadChromeDriver(){//
        System.setProperty("webdriver.chrome.driver","/Users/user/IdeaProjects/Selenium_HomeWork/src/main/resources/driver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--window-size-1920,1080");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);//тест будет ждать пока вся страница загрузится

        if(Boolean.parseBoolean(ConfigReader.getValue("headless"))){
            options.addArguments("--headless");
        }


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().maximize();
        return driver;
    }
}
/*public class ConfigReader {

Объявляет публичный класс ConfigReader, который будет использоваться для чтения конфигурационных данных.
private static Properties properties;

Объявляет приватное статическое поле properties, которое будет использоваться для хранения загруженных свойств из файла.
private ConfigReader() {

Объявляет приватный конструктор класса ConfigReader, чтобы предотвратить создание экземпляров этого класса извне.
static {

Начало статического блока инициализации. Этот блок будет выполнен один раз при первой загрузке класса.
try {

Начало блока try, в котором выполняются операции, которые могут вызвать исключения.
String path = "src/main/resources/application.properties";

Определение пути к файлу application.properties, который содержит конфигурационные данные.
FileInputStream inputStream = new FileInputStream(path);

Создание потока inputStream для чтения данных из файла, указанного в переменной path.
properties = new Properties();

Создание нового объекта Properties, который будет использоваться для хранения свойств из файла.
properties.load(inputStream);

Загрузка свойств из потока inputStream в объект properties.
inputStream.close();

Закрытие потока inputStream после завершения чтения данных из файла.
} catch (IOException e) {

Начало блока catch, который обрабатывает исключения типа IOException, возникающие при ошибках ввода-вывода.
throw new RuntimeException("file not found");

В случае возникновения исключения IOException, выбрасывается новое исключение типа RuntimeException с сообщением "file not found".
}

Завершение блока try-catch.
public static String getValue(String key){

Определение публичного статического метода getValue, который принимает ключ key и возвращает значение свойства из объекта properties.
return properties.getProperty(key).trim();

Возвращает значение свойства, связанное с указанным ключом key. Метод trim() используется для удаления начальных и конечных пробелов из строки значения.
}

Завершение метода getValue.
}

Завершение класса ConfigReader. */
