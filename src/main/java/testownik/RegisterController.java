package testownik;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import profile.ProfileForm;

/**
 * Created by Tobiasz Rumian on 10.02.2017.
 */
@Controller
public class RegisterController {
    @RequestMapping("/registration")
    public String displayRegistration(ProfileForm profileForm){
        return "registrationPage";
    }
    @RequestMapping(value="/profile",method= RequestMethod.POST)
    public String saveProfile(ProfileForm profileForm){
        System.out.println("Pomyślnie zapisano profil"+profileForm);
        return "redirect:/profile";
    }
}
