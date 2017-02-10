package testownik;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tobiasz Rumian on 09.02.2017.
 */
@Controller
public class MainPageController {

    @RequestMapping("/")
    public String index(){
        return "registrationPage";
    }
}
