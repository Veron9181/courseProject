package webdriver.elements;

import org.openqa.selenium.By;

/**
 * Class, Describing element LinkText
 */
public class LinkText extends BaseElement {

    /**
     *
     * @param locator
     * @param name
     */
    public LinkText(final By locator, final String name) {
        super(locator, name);
    }

    public LinkText(String string, String name) {
    	 super(string, name);
	}


	protected String getElementType() {
        return getLoc("loc.button");
    }

    public boolean isEnabled(){
    	return this.getElement().isEnabled();
    }


	


	public LinkText(By locator) {
		super(locator);
	}


}
