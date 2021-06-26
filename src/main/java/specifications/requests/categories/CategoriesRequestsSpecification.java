package specifications.requests.categories;

import specifications.requests.BaseRequestSpecification;

public class CategoriesRequestsSpecification extends BaseRequestSpecification<CategoriesRequestsSpecification> {

    public CategoriesRequestsSpecification () {
        super();
        requestSpecBuilder.setBasePath("/categories");
    }

    @Override
    protected CategoriesRequestsSpecification self() {
        return this;
    }
}
