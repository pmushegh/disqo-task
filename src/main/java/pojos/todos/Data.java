package pojos.todos;

public class Data
{
    private String updated_at;

    private String user_id;

    private String created_at;

    private String id;

    private String completed;

    private String title;

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getUser_id ()
    {
        return user_id;
    }

    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCompleted ()
    {
        return completed;
    }

    public void setCompleted (String completed)
    {
        this.completed = completed;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [updated_at = "+updated_at+", user_id = "+user_id+", created_at = "+created_at+", id = "+id+", completed = "+completed+", title = "+title+"]";
    }
}