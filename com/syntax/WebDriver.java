package com.syntax;

public interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("open ChromeDriver");
    }

    @Override
    public void close() {
        System.out.println("close ChromeDriver");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("ChromeDriver screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("navigate to Chrome driver");
    }
}

class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("open FirefoxDriver");
    }

    @Override
    public void close() {
        System.out.println("close FirefoxDriver");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("FirefoxDriver screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("navigate to Firefox Driver");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("open SafariDriver");
    }

    @Override
    public void close() {
        System.out.println("close SafariDriver");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("SafariDriver screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("navigate to Safari");
    }
}

class Tester {
    public static void main(String[] args) {
        RemoteWebDriver[] driver = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver r : driver) {
            r.open();
            r.close();
            System.out.println(r.getTitle());
            r.getScreenshot();
            r.navigate();
        }
    }
}

