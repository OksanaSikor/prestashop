package page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class RegistrationPage extends Page {

    @FindBy(xpath = "//h3[@class='page-subheading']")
    private WebElement nameToSection;

    public String getTextOfPageSection() {
        return nameToSection.getText();
    }
}
