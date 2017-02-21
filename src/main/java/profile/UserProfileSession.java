package profile;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by Tobiasz Rumian on 21.02.2017.
 */
@Component
@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserProfileSession implements Serializable{
    private String nick;
    private String email;
    private String password;

    public void saveForm(ProfileForm profileForm){
        this.nick=profileForm.getNick();
        this.email=profileForm.getEmail();
        this.password=profileForm.getPassword();
    }

    public ProfileForm toForm(){
        ProfileForm profileForm=new ProfileForm();
        profileForm.setNick(nick);
        profileForm.setEmail(email);
        profileForm.setPassword(password);
        return profileForm;
    }
}
