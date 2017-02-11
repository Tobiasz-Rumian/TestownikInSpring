package testownik;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import profile.ProfileForm;

import javax.validation.Valid;

/**
 * Created by Tobiasz Rumian on 10.02.2017.
 */
@Controller
public class RegistrationController {

    @GetMapping("/registrationPage")
    public String displayRegistration(Model model) {
        model.addAttribute("profileForm", new ProfileForm());
        return "registrationPage";
    }

    @PostMapping("/registrationPage")
    public String saveProfile(@Valid ProfileForm profileForm, BindingResult bindingResult) {
        if( bindingResult.hasErrors()){
            return "registrationPage";
        }
        System.out.println("Pomyślnie zapisano profil"+profileForm);
        return "registrationPage";
    }
}
