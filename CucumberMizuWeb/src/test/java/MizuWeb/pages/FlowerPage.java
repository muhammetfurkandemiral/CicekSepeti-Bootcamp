package MizuWeb.pages;

import MizuWeb.utils.Driver;
import MizuWeb.utils.Helpers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static MizuWeb.utils.Helpers.productCount;
import static MizuWeb.utils.Helpers.validateSortProducts;

public class FlowerPage {
    public FlowerPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    By products = By.className("price__integer-value");
    @FindBy(className = "js-filter-sort-item")
    public WebElement sortDropdownButton;

    public void sortWith(String priceCriteria) {
        sortDropdownButton.click();

        By sortCriteria = By.xpath("//label[text()='Price: " + priceCriteria + "']");
        Helpers.clickWithButtonText(sortCriteria).click();
    }

    public void validateSorting() {
        int index = 0, test_count = 3;
        int length = productCount(products);

        while (index < length) {
            int first = validateSortProducts(products, index);
            int secondary = validateSortProducts(products, index + 1);

            if (first >= secondary)
                Assert.assertTrue(true);
            else
                Assert.fail((index + 1) + ". ürün yanlış sırada!");
            index = index + (length / test_count);
        }
    }
}