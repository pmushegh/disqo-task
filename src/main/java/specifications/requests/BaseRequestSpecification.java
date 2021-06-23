package specifications.requests;

import io.qameta.allure.Step;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public abstract class BaseRequestSpecification<T extends BaseRequestSpecification> {

    protected RequestSpecBuilder requestSpecBuilder;

    protected BaseRequestSpecification() {
        requestSpecBuilder = new RequestSpecBuilder();
    }

    @Step
    public T setContentType(ContentType contentType) {
        requestSpecBuilder.setContentType(contentType);
        return self();
    }

    /**
     * Add JSON as a default content-type
     *
     * @return this
     */
    @Step
    public T setContentType() {
        return setContentType(ContentType.JSON);
    }

    @Step
    public T setAccessToken(String strToken) {
        requestSpecBuilder.addHeader("Authorization", "Bearer " + strToken);
        return self();
    }

    @Step
    public T setAccept(ContentType contentType) {
        requestSpecBuilder.setAccept(contentType);
        return self();
    }

    /**
     * Add JSON as a default accepted ContentType
     *
     * @return this
     */
    @Step
    public T setAccept() {
        return setAccept(ContentType.JSON);
    }

    @Step
    public RequestSpecification buildSpec() {
        return requestSpecBuilder.build();
    }

    protected abstract T self();
}
