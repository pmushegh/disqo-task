package pojos.categories;

public class Data {
    private String name;

    private String description;

    private String id;

    private String status;

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

    public String getStatus () {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }

    @Override
    public String toString () {
        return "ClassPojo [name = " + name + ", description = " + description + ", id = " + id + ", status = " + status + "]";
    }
}