package specifications.requests.product_categories;

import specifications.requests.BaseRequestSpecification;

public class ProductCategoriesRequestsSpecification extends BaseRequestSpecification<ProductCategoriesRequestsSpecification> {

    public ProductCategoriesRequestsSpecification () {
        super();
        requestSpecBuilder.setBasePath("/product-categories");
    }

    @Override
    protected ProductCategoriesRequestsSpecification self() {
        return this;
    }
}
