package pojos.products;

public class Data {
    private String image;

    private String price;

    private String discount_amount;

    private String name;

    private String description;

    private String id;

    private Categories[] categories;

    private String status;

    public String getImage () {
        return image;
    }

    public void setImage (String image) {
        this.image = image;
    }

    public String getPrice () {
        return price;
    }

    public void setPrice (String price) {
        this.price = price;
    }

    public String getDiscount_amount () {
        return discount_amount;
    }

    public void setDiscount_amount (String discount_amount) {
        this.discount_amount = discount_amount;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public Categories[] getCategories () {
        return categories;
    }

    public void setCategories (Categories[] categories) {
        this.categories = categories;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }

    @Override
    public String toString () {
        return "ClassPojo [image = " + image + ", price = " + price + ", discount_amount = " + discount_amount + ", name = " + name + ", description = " + description + ", id = " + id + ", categories = " + categories + ", status = " + status + "]";
    }
}