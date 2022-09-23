package AutomateRegisterPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {

    public static void selectValueFromDropdown(WebElement element, String value){
        Select select =new Select(element);
        select.deselectByVisibleText(value);

    }
}
