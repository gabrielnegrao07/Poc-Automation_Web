package configuration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver webDriver;

    public static WebDriver createDriverByParameter() {
        System.setProperty("webdriver.chrome.driver", "/home/ice_aalmeida/prj/treinamento-automacao/webdrivers/chromedriver_linux64/chromedriver");
        String hostToTest = "http://algamoney-web.s3-website-sa-east-1.amazonaws.com/login";

        webDriver = new ChromeDriver();
        webDriver.get(hostToTest);

        return webDriver;
    }

    public static WebDriver getDriver() {
        return webDriver;
    }

    public static void quitDriver() {
        webDriver.close();
    }


}
