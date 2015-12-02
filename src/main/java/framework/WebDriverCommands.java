package framework;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Lena on 04.07.2014.
 */
public class WebDriverCommands implements Constants {

    public static WebDriver driver;
    public WebElement element;

    public void openUrl(String url){
        driver.get(url);
    }

    /**
     * Method waits for equal page title present for timeout interval
     * @param title     String Page title
     * @param timeOut   Integer Interval in sec to wait
     * @return true: if page title equals
     *         false: otherwise
     */
    public boolean isTitlePresent(final String title, int timeOut) {


        for (int i=0; i< timeOut; i++){
            if (driver.getTitle().equals(title)) {
                return true;
            }
        }

       return false;
    }

    /**
     * Method waits for element displayed
     * @param by        By Element
     * @return  true: if element displayed
     *          false: otherwise
     */
    public boolean isElementDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }

    /**
     * Method waits for element enabled
     * @param by        By Element
     * @param timeOut   Integer Interval in sec to wait
     * @return  true: if element enabled
     *          false: otherwise
     */
    public boolean isElementEnabled(By by, int timeOut) {

        for (int i=0; i< timeOut; i++){
            element = driver.findElement(by);
            if (element.isEnabled()){
                return true;
            }
        }

        return false;
    }

    /**
     * Method waits for timeout interval
     * @param secsToWait   Integer Interval in sec to wait
     */
    public void waitTime(int secsToWait) {

        try {
            for (int second = 0; ; second++) {
                if ((second > secsToWait)) {
                    break;
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }

    }

    /**
     * Once called, method set timeout before any findElement command in future
     * WebDriver has timeout=0 by default
     * You need to call method again to change timeout
     * @param timeout   Integer Interval in sec to wait
     */
    public void implicitWait(int timeout){
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    /**
     * Method finds and returns select element
     * @param by    By Element
     * @return  select element
     */
    public Select selectElements(By by){
        element = driver.findElement(by);
        Select select = new Select(element);
        return select;
    }

    /**
     * Method clicks on element
     * @param by    By Element
     */
    public void click(By by){
        if (isElementDisplayed(by)){
            driver.findElement(by).click();
        }

    }

    public void clickElementPoint(By by){
        if (isElementDisplayed(by)) {
            Point elementPoint = driver.findElement(by).getLocation();
            int elementX = elementPoint.getX();
            int elementY = elementPoint.getY();
            new Actions(driver).moveByOffset(elementX, elementY).click().perform();
        }
    }

    /**
     * Method send keys to element
     * @param by    By Element
     * @param value String value
     */
    public void sendKeys(By by, String value){
        if (isElementPresent(by)){
            driver.findElement(by).sendKeys(value);
        }
    }

    /**
     * Method clear element
     * @param by By Element
     */
    public void clear(By by){
        if (isElementPresent(by)){
            driver.findElement(by).clear();
        }
    }

    /**
     * Method find Element on page
     * @param by By Element
     * @return  WebElement
     */
    public WebElement findElement (By by) {
        return driver.findElement(by);
    }

    /**
     * Method checks if element is present on page
     * @param by    By Element
     * @return  true: if element present
     *          false: otherwise
     */
    public static boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     * Method waits for element present
     * @param by
     * @param timeOut
     */
    public void waitForElementPresent(By by, int timeOut){
        for (int i=0; i<timeOut; i++){
            if (isElementPresent(by)) break;
        }
    }

    /**
     * Method checks if alert is present on page
     * @return  true: if element present
     *          false: otherwise
     */
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void clickOnInvisibleElement(WebElement element) {

        String script = "var object = arguments[0];"
                + "var theEvent = document.createEvent(\"MouseEvent\");"
                + "theEvent.initMouseEvent(\"click\", true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
                + "object.dispatchEvent(theEvent);"
                ;

        ((JavascriptExecutor)driver).executeScript(script, element);
    }

    /**
     * Method makes disabled elements with style="display: none;" visible by its id
     *
     * @param elementProperty   String property of element disabled
     */
    public void makeDisabledElementVisibleById(String elementProperty) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.getElementById('" + elementProperty + "').style.display='block';");
    }

    /**
     * Method makes disabled elements with style="display: none;" visible by its name
     *
     * @param elementProperty   String property of element disabled
     */
    public void makeDisabledElementVisibleByName(String elementProperty) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.getElementsByName('" + elementProperty + "')[0].style.display='block';");
    }

    /**
     * Method wait for element displayed
     * @param by        By Element
     * @param timeOut   Integer time to wait in sec
     */
    public void waitForElementDisplayed(final By by, int timeOut) {
        (new WebDriverWait(driver, timeOut))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(by));
    }

    /**
     * Method wait for element not visible
     * @param by        By Element
     * @param timeOut   Integer Interval in sec to wait
     */
    public void waitForElementNotVisible(final By by, int timeOut){
        (new WebDriverWait(driver, timeOut))
                .until(ExpectedConditions
                        .invisibilityOfElementLocated(by));
    }

    /**
     * Method drags and drops element
     * @param by        By By Element
     * @param offsetX   Integer offset by X in px
     * @param offsetY   Integer offset by Y in px
     */
    public void dragAndDropElement(By by, int offsetX, int offsetY){
        Actions move = new Actions(driver);
        move.clickAndHold(findElement(by)).moveByOffset(offsetX, offsetY).release().perform();
    }

    /**
     * Method imitates keyboard pressing
     * @param by    By Element
     * @param key   Key key
     */
    public void pressKeyBoardButton(By by, Keys key) {
        findElement(by).sendKeys(key);
    }

    /**
     * Method imitates key down and key press at the same time
     * @param keyDown   Key key down
     * @param keyPress  Key key press
     */
    public void pressKeysCombination(Keys keyDown, Keys keyPress) {
        Actions action = new Actions(driver);
        action.keyDown(keyDown).sendKeys(keyPress).perform();
    }

    /**
     * Method imitates keyboard pressing for modifier keys
     * @param key   Key key
     */
    public void pressKeyBoardModifierButton(By by, Keys key) {
        Actions action = new Actions(driver);
        action.keyDown(key);
    }

    /**
     * Method check if there is text on page
     * @param textValue
     * @return  true: if present
     *          false: otherwise
     */
    public boolean isTextOnPage(String textValue) {
        return driver.getPageSource().contains(textValue);
    }

    /**
     * Method switch to new browser tab
     */
    public void switchToNewTab(int tabNumber){ //tab number starts from 0
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
//        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(tabNumber));
    }

    public String returnWindowHandle(){
        return driver.getWindowHandle();
    }

    /**
     * Method close new tab and switch to old one
     * @param oldTabWindowHandle
     */
    public void closeNewTab(String oldTabWindowHandle){
        driver.close();
        driver.switchTo().window(oldTabWindowHandle);
    }

    /**
     * Method makes element with display-none visible
     * @param element
     */
    public void makeElementVisibleByJavascript(final WebElement element) {
        String script = "var element = arguments[0];"
                + "element.style.display='block';"
                ;
        ((JavascriptExecutor)driver).executeScript(script, element);
    }

    public String getBrowserName(){
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = caps.getBrowserName().toLowerCase();
        return browserName;

    }

    public static String getYearFromCurrent(int monthsCount){
        Calendar currentMonth = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        currentMonth.add(Calendar.YEAR, monthsCount);
        return dateFormat.format(currentMonth.getTime());
    }

    public static String getMonthFromCurrent(int monthsCount){
        Calendar currentMonth = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM");
        currentMonth.add(Calendar.MONTH, monthsCount);
        return dateFormat.format(currentMonth.getTime());
    }

    public static String getMonthDayFromCurrent(int monthDayCount){
        Calendar currentMonth = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
        currentMonth.add(Calendar.DAY_OF_MONTH, monthDayCount);
        return dateFormat.format(currentMonth.getTime());
    }

    public static String  getFullDateFromCurrent(int daysCount){
        Calendar c = Calendar.getInstance();
        Date dt = new Date();
        c.setTime(dt);
        c.add(Calendar.DATE, daysCount);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(c.getTime());
    }

    public static String  getFullDateMonthNameFromCurrent(int daysCount){
        Calendar c = Calendar.getInstance();
        Date dt = new Date();
        c.setTime(dt);
        c.add(Calendar.DATE, daysCount);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        return dateFormat.format(c.getTime());
    }

    public static String getDateMonthFromCurrent(int daysCount){
        Calendar c = Calendar.getInstance();
        Date dt = new Date();
        c.setTime(dt);
        c.add(Calendar.DATE, daysCount);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM");
        return dateFormat.format(c.getTime());
    }

    public static String addDaysToDate(String dateToAdd, int daysToAdd){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(dateToAdd));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.add(Calendar.DATE, daysToAdd);  // number of days to add
        return sdf.format(c.getTime());
    }

    public String deleteFirstNullFromDate(String dayValue){
        dayValue = dayValue.replaceFirst("^0", "");
        return dayValue;
    }

    public String getNightsAmount(String dateFromValue, String dateToValue) throws Exception{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateFrom = null;
        Date dateTo = null;
        try {
            dateFrom = format.parse(dateFromValue);
            dateTo = format.parse(dateToValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long difference = dateTo.getTime() - dateFrom.getTime();
        return Integer.toString((int) difference / (24 * 60 * 60 * 1000));
    }

    public Date convertStringDateToDate(String stringDate, String dateFormat) throws Exception{
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        Date date = null;
        try {
            date = format.parse(stringDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    public String getMonthFirstDay(int monthsCount){
        Calendar currentMonth = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        currentMonth.add(Calendar.MONTH, monthsCount);
        currentMonth.set(Calendar.DAY_OF_MONTH, 1);
        return dateFormat.format(currentMonth.getTime());
    }

    public String getMonthLastDay(int monthsCount){
        Calendar currentMonth = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        currentMonth.add(Calendar.MONTH, monthsCount);
        currentMonth.set(Calendar.DAY_OF_MONTH, currentMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
        return dateFormat.format(currentMonth.getTime());
    }

    public Object executeJs(String jsToExecute) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript(jsToExecute);
        return new Object();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void waitForPageLoad(int timeToWait){
        driver.manage().timeouts().implicitlyWait(timeToWait, TimeUnit.SECONDS);
    }

    public void pressEnterKeyButton(){
        driver.findElement(By.id("Value")).sendKeys(Keys.RETURN);
    }

    public void sendKeyBoardKeys(By by, Keys key){
        if (isElementPresent(by)){
            driver.findElement(by).sendKeys(key);
        }
    }

    public void getTextAlert(){
        try{
            if(driver.switchTo().alert() != null){
                Alert alert = driver.switchTo().alert();
                alert.getText();
                //etc.
            }
        }catch(Exception e){}

    }

    public String getAbsoluteFilePath(String filePath){
        return System.getProperty("user.dir") + filePath;
    }

    public void runScript(String scriptPath) throws Exception{
            Runtime.getRuntime().exec(getAbsoluteFilePath(scriptPath));
    }



}
