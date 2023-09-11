import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reading {
    public static void main(String[] args) {
        WebDriver dri = new ChromeDriver();
        dri.get("https://www.google.com");
    }
}
