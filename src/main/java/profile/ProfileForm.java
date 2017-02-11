package profile;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Tobiasz Rumian on 10.02.2017.
 */
public class ProfileForm {
    @NotEmpty
    private String nick;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setNick(String nick) {

        this.nick = nick;
    }

    public String getPassword() {

        return password;
    }

    public String getEmail() {

        return email;
    }

    public String getNick() {
        return nick;

    }
}
