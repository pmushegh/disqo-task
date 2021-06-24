package specifications.requests.posts;

import specifications.requests.BaseRequestSpecification;

public class PostsRequestsSpecification extends BaseRequestSpecification<PostsRequestsSpecification> {

    public PostsRequestsSpecification() {
        super();
        requestSpecBuilder.setBasePath("/posts");
    }

    @Override
    protected PostsRequestsSpecification self() {
        return this;
    }
}
