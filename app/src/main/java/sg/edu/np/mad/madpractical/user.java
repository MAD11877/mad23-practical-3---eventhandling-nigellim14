package sg.edu.np.mad.madpractical;

public class user {

    public user(boolean b) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    private String name;
    private String description;
    private int id;

    public void user(boolean followed) {
        this.followed = followed;
    }

    private boolean followed;

}


