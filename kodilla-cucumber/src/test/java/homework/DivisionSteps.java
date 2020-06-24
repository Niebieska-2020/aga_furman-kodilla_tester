package homework;

import io.cucumber.java8.En;

import static org.junit.Assert.assertEquals;

public class DivisionSteps implements En {

    private int number;
    private String message;

    public DivisionSteps() {
        Given("I have a {int}", (Integer numberInput) -> {
            this.number = numberInput;
        });

        When("Checking if number is divisible by (\\d+) and (\\d+)", (Integer arg0, Integer arg1) -> {
            if (number % 3 == 0 && number % 5 == 0) {
                this.message = "FizzBuzz";
            } else if (number % 3 == 0) {
                this.message = "Fizz";
            } else if (number % 5 == 0) {
                this.message = "Buzz";
            } else {
                this.message = "None";
            }
        });

        Then("I should be returned {string}", (String string) -> {
            assertEquals(string, message);
        });
    }
}
