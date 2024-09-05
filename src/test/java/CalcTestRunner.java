import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{
    @Test
    public void doCalculation(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String result=calcScreen.doCalculation();
        System.out.println(result);
        Assert.assertEquals(result,"100");

    }

}
