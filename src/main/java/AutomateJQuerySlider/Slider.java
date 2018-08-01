package AutomateJQuerySlider;

import org.jboss.arquillian.graphene.findby.FindByJQuery;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Slider {

    @FindByJQuery(".ui-slider-handle")
    private WebElement sliderHandle;

    @ArquillianResource
    private Actions action;

    @ArquillianResource
    private JavascriptExecutor js;

    public void moveBy(int p) {
        action.click(sliderHandle).build().perform();
        Keys key = p > 0 ? Keys.ARROW_RIGHT : Keys.ARROW_LEFT;
        p = Math.abs(p);
        for (int i = 0; i < p; i++) {
            action.sendKeys(key).build().perform();
        }
    }

    public String getValue() {
        return (String) js.executeScript("return arguments[0].style.left", sliderHandle);
    }
}