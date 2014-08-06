package webdriver.elements;

import org.openqa.selenium.By;

/**
 * Class, Describing element radio button
 */
public class RadioButton extends BaseElement {

    /**
     *
     * @param locator
     * @param name
     */
    public RadioButton(final By locator, final String name) {
        super(locator, name);
    }

    public RadioButton(String string, String name) {
    	 super(string, name);
	}

	protected String getElementType() {
        return getLoc("loc.button");
    }

    public boolean isEnabled(){
    	return this.getElement().isEnabled();
    }

	public RadioButton(By locator) {
		super(locator);
	}
}
