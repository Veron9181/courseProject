package webdriver.elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

/**
 * Class, Describing element select
 */
public class SelectBox extends BaseElement {

    /**
     *
     * @param locator
     * @param name
     */
    public SelectBox(final By locator, final String name) {
        super(locator, name);
    }

    public SelectBox(String string, String name) {
    	 super(string, name);
	}

    public SelectBox(By locator){
        super(locator);
    }

    protected String getElementType() {
        return getLoc("loc.select");
    }

    public boolean isEnabled(){
    	return this.getElement().isEnabled();
    }
    
    public void select(String value){
       WebDriver driver = browser.getDriver();
       RemoteWebElement selects = (RemoteWebElement) driver.findElement(locator);
       selects.click();
       List<WebElement> options = selects.findElements(By.tagName("option"));
       for (WebElement option : options){
            if(value.equals(option.getText().trim())){
               option.click();
            }
       }
    }
    
}