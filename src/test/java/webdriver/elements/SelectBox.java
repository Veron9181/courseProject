package webdriver.elements;

import java.util.List;
import org.openqa.selenium.*;

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
    	WebElement select = (WebElement) browser.getDriver().findElement(locator);
    	List<WebElement> options = select.findElements(By.tagName("option"));
    		for (WebElement option : options){
    				if((option.getText()).equals(value)){
    					option.click();
    				}
    		}
    	}
    }