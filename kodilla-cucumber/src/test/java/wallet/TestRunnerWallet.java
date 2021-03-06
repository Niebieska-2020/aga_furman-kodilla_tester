package wallet;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/wallet/cash_withdrawal_successful_path.feature", "src/test/resources/wallet/cash_withdrawal_unsuccessful_path.feature",
                "src/test/resources/wallet/display_balance.feature", "src/test/resources/wallet/prevent_users_from_going_overdrawn.feature"}
)
public class TestRunnerWallet {
}
