package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    private Calculator calculator;
    private int value1;
    private int value2;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I do operation ([\\*/\\^]) between the two values$")
    public void iDoOperationBetweenTheTwoValues(char arg0) {
        result = calculator.doOperation(value1, value2, arg0);
    }

    @Then("^I expect the result to be (-?\\d+|-?\\d+.\\d+)$")
    public void iExpectTheResultToBe(double arg0) {
        Assert.assertEquals(arg0, result, 1e-6);
    }
}
