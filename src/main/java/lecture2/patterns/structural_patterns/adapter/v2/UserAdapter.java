package lecture2.patterns.structural_patterns.adapter.v2;

public class UserAdapter extends User implements UserDetails{
    @Override
    public String setUsers(String name) {
        return getUsername();
    }

    @Override
    public String setPass(String pass) {
        return getPassword();
    }
}
