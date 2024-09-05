import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id="com.google.android.calculator:id/digit_1")
    WebElement btn1;
    @FindBy(id="com.google.android.calculator:id/digit_0")
    WebElement btn0;
    @FindBy(id="com.google.android.calculator:id/digit_5")
    WebElement btn5;
    @FindBy(id="com.google.android.calculator:id/digit_6")
    WebElement btn6;
    @FindBy(id="com.google.android.calculator:id/op_mul")
    WebElement btnMultiply;
    @FindBy(id="com.google.android.calculator:id/op_div")
    WebElement btnDivision;
    @FindBy(id="com.google.android.calculator:id/op_add")
    WebElement btnAddition;
    @FindBy(id="com.google.android.calculator:id/op_sub")
    WebElement btnSubtraction;
    @FindBy(id="com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id="com.google.android.calculator:id/result_final")
    WebElement txtResult;

    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public int doCalculation(int num1, int num2, int num3, int num4){
        // 100/10*5-10+60
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnDivision.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnMultiply.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num3)).click();
        btnSubtraction.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnAddition.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num4)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnEqual.click();
        return Integer.parseInt(txtResult.getText());
    }

}
