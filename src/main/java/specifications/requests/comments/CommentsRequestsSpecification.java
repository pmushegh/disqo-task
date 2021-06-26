package specifications.requests.comments;

import specifications.requests.BaseRequestSpecification;

public class CommentsRequestsSpecification extends BaseRequestSpecification<CommentsRequestsSpecification> {

    public CommentsRequestsSpecification () {
        super();
        requestSpecBuilder.setBasePath("/comments");
    }

    @Override
    protected CommentsRequestsSpecification self() {
        return this;
    }
}
