package profile;

/**
 * Created by Tobiasz Rumian on 10.02.2017.
 */
public class ProfileForm {
    private String nick;
    private String email;
    private String password;
    public void setNick(String nick){
        this.nick=nick;
    }
    public String getNick(){
        return nick;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
}
