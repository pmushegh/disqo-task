package tests.users;

import io.qameta.allure.Description;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.users.Users;
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

    @Description("Test Case: 2")
    @Test(dependsOnMethods = "sussesResponseCodeCheck")
    public void paginationPropertiesCheck() {
        Users users = given().spec(new UsersRequestsSpecification().setAccept().buildSpec())
                .when().get()
                .then().extract().body().as(Users.class);

        Assert.assertEquals(users.getMeta().getPagination().getPage(), "1", "Default page number should be 1");
        Assert.assertEquals(users.getMeta().getPagination().getLimit(), "20", "Default page limit should be 20");
    }

    @Description("Test Case: 1 and 2 combined")
    @Test
    public void checkResponseCodeAndPaginationProperties() {
        given().spec(new UsersRequestsSpecification().setAccept().buildSpec())
                .when().get()
                .then().statusCode(is(equalTo(HttpStatus.SC_OK)))
                .body("meta.pagination.page", is(equalTo(1)))
                .body("meta.pagination.limit", is(equalTo(20)));
    }
}
