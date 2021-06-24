package specifications.requests.users;

import specifications.requests.BaseRequestSpecification;

public class UsersRequestsSpecification extends BaseRequestSpecification<UsersRequestsSpecification> {

    public UsersRequestsSpecification() {
        super();
        requestSpecBuilder.setBasePath("/users");
    }

    @Override
    protected UsersRequestsSpecification self() {
        return this;
    }
}
