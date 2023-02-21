package groupe204.lab1.shop;

public class RolesHasUser {

    private Long id;
    private User user;
    private Roles roles;

    public RolesHasUser() {
    }

    public RolesHasUser(Long id, User client, Roles roles) {
        this.id = id;
        this.user = client;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User client) {
        this.user = client;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "RolesHasUser{" +
                "id=" + id +
                ", client=" + user +
                ", roles=" + roles +
                '}';
    }
}
