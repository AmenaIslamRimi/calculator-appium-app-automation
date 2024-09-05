import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{
    @Test
    public void doCalculation(){
        CalcScreen calcScreen = new CalcScreen(driver);
        int result=calcScreen.doCalculation(1,0,5,6);
        System.out.println(result);
        Assert.assertEquals(result,100);

    }

}
