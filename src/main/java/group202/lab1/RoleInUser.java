package group202.lab1;

public class RoleInUser {

    private int id;

    private Role role;

    private User user;

    public RoleInUser() {
    }

    public RoleInUser(int id, Role role, User user) {
        this.id = id;
        this.role = role;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "RoleInUser{" +
                "id=" + id +
                ", role=" + role +
                ", user=" + user +
                '}';
    }
}
