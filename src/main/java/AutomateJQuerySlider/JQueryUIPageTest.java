package AutomateJQuerySlider;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.testng.Arquillian;
import org.testng.Assert;
import org.testng.annotations.Test;

@RunAsClient
public class JQueryUIPageTest extends Arquillian {

    @Page
    private JQueryUIPage sliderPage;

    @Test(priority = 1)
    public void goTo() {
        sliderPage.goTo();
    }

    @Test(priority = 2)
    public void moveRightBy25() {
        sliderPage.getSlider().moveBy(25);
        Assert.assertEquals("25%", sliderPage.getSlider().getValue());
    }

    @Test(priority = 3)
    public void moveLeftBy20() {
        sliderPage.getSlider().moveBy(-20);
        Assert.assertEquals("5%", sliderPage.getSlider().getValue());
    }

    @Test(priority = 4)
    public void moveRightBy50() {
        sliderPage.getSlider().moveBy(50);
        Assert.assertEquals("55%", sliderPage.getSlider().getValue());
    }

}