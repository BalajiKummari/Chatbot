package models;


import org.bson.types.ObjectId;
import xyz.morphia.annotations.Entity;
import xyz.morphia.annotations.Id;

@Entity(value= "users")
public class User {
    private String username;
    private String password;
    Boolean isloggedin = false;
    @Id
    private ObjectId _id;

    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsloggedin() {
        return isloggedin;
    }

    public boolean setIsloggedin(Boolean isloggedin) {
        this.isloggedin = isloggedin;
        return false;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}


