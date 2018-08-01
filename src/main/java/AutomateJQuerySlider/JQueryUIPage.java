package AutomateJQuerySlider;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InFrame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class JQueryUIPage {

    @Drone
    private WebDriver driver;

    @FindBy(id = "slider")
    @InFrame(index = 0)
    private Slider slider;

    public void goTo() {
        driver.get("https://jqueryui.com/slider/");
    }

    public Slider getSlider() {
        return slider;
    }

}