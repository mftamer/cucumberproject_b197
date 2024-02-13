package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Google_HomePage {
    public Google_HomePage (){ // CONSTRUCTOR
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (name = "q")
    public WebElement searchBox;

    @FindBy (xpath = "(//div[@class='QS5gu sy4vM'])[2]")
    public WebElement cookiePopUp;

}
