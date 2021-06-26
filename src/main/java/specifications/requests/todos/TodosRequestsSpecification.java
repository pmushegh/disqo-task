package specifications.requests.todos;

import specifications.requests.BaseRequestSpecification;

public class TodosRequestsSpecification extends BaseRequestSpecification<TodosRequestsSpecification> {

    public TodosRequestsSpecification () {
        super();
        requestSpecBuilder.setBasePath("/todos");
    }

    @Override
    protected TodosRequestsSpecification self() {
        return this;
    }
}
