import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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

    // 100/10*5-10+60

    public CalcScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public String doCalculation(){
        // 100/10*5-10+60
        btn1.click();
        btn0.click();
        btn0.click();
        btnDivision.click();
        btn1.click();
        btn0.click();
        btnMultiply.click();
        btn5.click();
        btnSubtraction.click();
        btn1.click();
        btn0.click();
        btnAddition.click();
        btn6.click();
        btn0.click();
        btnEqual.click();
        return txtResult.getText();
    }

}
