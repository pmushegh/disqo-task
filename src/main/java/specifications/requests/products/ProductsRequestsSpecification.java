package specifications.requests.products;

import specifications.requests.BaseRequestSpecification;

public class ProductsRequestsSpecification extends BaseRequestSpecification<ProductsRequestsSpecification> {

    public ProductsRequestsSpecification () {
        super();
        requestSpecBuilder.setBasePath("/products");
    }

    @Override
    protected ProductsRequestsSpecification self() {
        return this;
    }
}
