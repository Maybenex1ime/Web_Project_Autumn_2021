package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLoginForm(){
        return "login";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "index";
    }
}
