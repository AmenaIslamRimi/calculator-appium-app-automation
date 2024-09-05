import org.testng.annotations.DataProvider;

public class TestDataSet {
    @DataProvider(name = "TestData")
    public Object[][] getData() {
        return new Object[][]{
                {1, 0, 5, 6, 100}
        };

    }
}

