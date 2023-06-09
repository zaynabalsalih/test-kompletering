// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SelenTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() {
    driver.get("https://bibliotek.burlov.se/-/arlovs-bibliotek");
    driver.manage().window().setSize(new Dimension(1552, 840));
    {
      WebElement element = driver.findElement(By.cssSelector("#navigation li:nth-child(2) span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("#navigation li:nth-child(2) span")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".branch-list-container:nth-child(2) h2")).click();
    js.executeScript("window.scrollTo(0,1.600000023841858)");
    driver.findElement(By.cssSelector(".no-glutter")).click();
    assertThat(driver.findElement(By.cssSelector(".street:nth-child(1)")).getText(), is("Gata\\\\nLommavägen 2"));
    js.executeScript("window.scrollTo(0,21.600000381469727)");
    driver.close();
  }
  @Test
  public void test2() {
    driver.get("https://bibliotek.burlov.se/-/arlovs-bibliotek");
    driver.manage().window().setSize(new Dimension(1054, 808));
    driver.findElement(By.linkText("Språk")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#portlet_com_liferay_site_navigation_language_web_portlet_SiteNavigationLanguagePortlet > .modal__close"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".goog-te-combo")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".goog-te-combo"));
      dropdown.findElement(By.xpath("//option[. = 'arabiska']")).click();
    }
    driver.findElement(By.cssSelector("#portlet_com_liferay_site_navigation_language_web_portlet_SiteNavigationLanguagePortlet > .modal__close")).click();
    driver.findElement(By.cssSelector(".goog-text-highlight")).click();
    assertThat(driver.findElement(By.cssSelector("h2:nth-child(2) > font > font")).getText(), is("معلومات الاتصال"));
    driver.close();
  }
  @Test
  public void test3() {
    driver.get("https://bibliotek.burlov.se/-/arlovs-bibliotek");
    driver.manage().window().setSize(new Dimension(1051, 806));
    {
      WebElement element = driver.findElement(By.cssSelector("#navigation li:nth-child(5) span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".logo-default"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("#navigation li:nth-child(4) span")).click();
    driver.findElement(By.cssSelector(".article-basic-title")).click();
    assertThat(driver.getTitle(), is("Barn och unga - Burlöv"));
    driver.close();
  }
  @Test
  public void test5() {
    driver.get("https://bibliotek.burlov.se/-/arlovs-bibliotek");
    driver.manage().window().setSize(new Dimension(1056, 808));
    driver.findElement(By.cssSelector("h2:nth-child(2)")).click();
    driver.findElement(By.cssSelector("h2:nth-child(2)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("h2:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("h2:nth-child(2)"));
      assert(elements.size() > 0);
    }
    driver.close();
  }
  @Test
  public void text4() {
    driver.get("https://bibliotek.burlov.se/#/");
    driver.manage().window().setSize(new Dimension(1054, 808));
    driver.findElement(By.cssSelector("#navigation li:nth-child(4) span")).click();
    driver.findElement(By.cssSelector(".article-basic-container")).click();
    driver.findElement(By.cssSelector(".article-basic-title")).click();
    driver.findElement(By.cssSelector(".article-basic-container")).click();
    assertThat(driver.findElement(By.cssSelector(".article-basic-body > p")).getText(), is("Här hittar du boktips, evenemang och allt annat vi har specifikt till dig som är barn och ungdom eller dig som är förälder/pedagog."));
    driver.close();
  }
}
