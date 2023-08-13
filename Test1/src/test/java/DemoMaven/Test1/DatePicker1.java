/*
 * package DemoMaven.Test1;
 *
 * import java.util.List;
 *
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 *
 * public class DatePicker1 {
 *
 * public static void main(String[] args) { // TODO Auto-generated method stub
 *
 * String expectedDay = "2"; String expectedMonth ="Aug"; String expectedyear
 * ="2024";
 *
 * System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");
 *
 * WebDriver driver = new FirefoxDriver();
 *
 *
 * driver.get("https://jqueryui.com/datepicker/");
 *
 * driver.switchTo().frame(0);
 *
 * WebElement datepick =driver.findElement(By.id("datepicker"));
 * datepick.click(); //*[@class="ui-icon ui-icon-circle-triangle-e"] while
 * (true) { String calendarMonth =
 * driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(
 * ); String calendarYear =
 * driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText()
 * ;
 *
 * if (calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedyear))
 * { List<WebElement> daysList =
 * driver.findElements(By.xpath("//table/tbody/tr/td"));
 *
 * for (WebElement e : daysList) { String calendarDay = e.getText(); if
 * (calendarDay.equals(expectedDay)) { e.click(); break; } }
 *
 * break; // Exit the while loop when the condition is met } else {
 * driver.findElement(By.
 * xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); } }
 *
 * }
 *
 * }
 */
package DemoMaven.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker1 {

    public static void main(String[] args) {
        String expectedDay = "2";
        String expectedMonth = "July";
        String expectedYear = "2024";

        System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);

        WebElement datepick = driver.findElement(By.id("datepicker"));
        datepick.click();

        while (true) {
            String calendarMonth = driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
            String calendarYear = driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();

            if (calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear)) {
                List<WebElement> daysList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td/a"));

                for (WebElement e : daysList) {
                    String calendarDay = e.getText();
                    if (calendarDay.equals(expectedDay)) {
                        e.click();
                        break;
                    }
                }

                break; // Exit the while loop when the condition is met
            } else {
                driver.findElement(By.cssSelector("a.ui-datepicker-next")).click();
            }
        }

        //driver.quit();
    }
}
