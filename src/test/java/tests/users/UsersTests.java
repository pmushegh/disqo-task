package tests.users;

import io.qameta.allure.Description;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import specifications.requests.users.UsersRequestsSpecification;
import tests.BaseTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UsersTests extends BaseTest {

    @Description("Test Case: 1")
    @Test
    public void sussesResponseCodeCheck() {
        given().spec(new UsersRequestsSpecification().setAccept().buildSpec())
                .when().get()
                .then().statusCode(is(equalTo(HttpStatus.SC_OK)));
    }
}
