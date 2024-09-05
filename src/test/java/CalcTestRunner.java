import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{
    @Test (dataProvider = "TestData", dataProviderClass = TestDataSet.class)
    public void doCalculation(int num1, int num2, int num3, int num4, int resultExpected){
        CalcScreen calcScreen = new CalcScreen(driver);
        int resultActual=calcScreen.doCalculation(1,0,5,6);
        System.out.println(resultActual);
        Assert.assertEquals(resultActual,resultExpected);

    }

}
