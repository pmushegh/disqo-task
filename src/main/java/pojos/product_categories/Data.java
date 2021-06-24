package pojos.product_categories;

public class Data {
    private String category_id;

    private String product_id;

    private String id;

    public String getCategory_id () {
        return category_id;
    }

    public void setCategory_id (String category_id) {
        this.category_id = category_id;
    }

    public String getProduct_id () {
        return product_id;
    }

    public void setProduct_id (String product_id) {
        this.product_id = product_id;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    @Override
    public String toString () {
        return "ClassPojo [category_id = " + category_id + ", product_id = " + product_id + ", id = " + id + "]";
    }
}
