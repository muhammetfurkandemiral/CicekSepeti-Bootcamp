package MizuWeb.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Helpers {
    public static WebElement clickWithButtonText(By buttonText) {
        return Driver.get().findElement(buttonText);
    }

    public static int validateSortProducts(By products, int i) {
        List<WebElement> myElements = Driver.get().findElements(products);
        WebElement p1 = myElements.get(i);
        return Integer.parseInt(p1.getText().replace(",", ""));
    }

    public static int productCount(By products) {
        List<WebElement> myElements = Driver.get().findElements(products);
        return myElements.size();
    }
}