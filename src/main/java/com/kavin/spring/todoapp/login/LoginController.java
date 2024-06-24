package com.kavin.spring.todoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }


    @RequestMapping(value="login", method=RequestMethod.GET)
    public String loginPage(){ 

        return "login";// JSP file name
    }

    @RequestMapping(value="login", method=RequestMethod.POST)
    public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){ 
        if(authenticationService.authenticate(name, password) == true){
            model.put("name", name);// model to view
            
            return "welcome";// JSP file name
        }
        model.put("errorMessage", "Invalid Credentials!!!"); // controller to model
        return "login";
    }
    
}
