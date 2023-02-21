package groupe205;

public class RoleHasUser {

    private Role role;
    private User user;


    public RoleHasUser() {
    }

    public RoleHasUser(Role role, User user) {
        this.role = role;
        this.user = user;
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
}
