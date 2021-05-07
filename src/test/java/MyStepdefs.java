import com.demo.Addition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.junit.Assert.assertEquals;

public class MyStepdefs {
    int sum;
    @Given("^a calculator I just turned on$")
    public void aCalculatorIJustTurnedOn() throws Throwable {
        int a=4;
        int b=5;
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void iAddAnd(int arg0, int arg1) throws Throwable {
        Addition obj= new Addition();
        sum =obj.add(4,5);
    }



    @Then("^the and result is (\\d+)$")
    public void theResultIs(int arg0) throws Throwable {
        int expValue=9;
        assertEquals(expValue,sum);
    }
}
