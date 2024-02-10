package com.springweb.todo.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    //JSP -> View Creation
//    @RequestMapping("login")
//    @ResponseBody
//    public String gotoLoginPage(@RequestParam String name, ModelMap model){
//        model.put("name", name);
////        System.out.println(name);
//        logger.debug("Request param is {}", name);
//        logger.info("Info level printed");
//        return "login";
//    }

    @Autowired
    private AuthenticationService authenticationService;
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap map){
        if (authenticationService.authenticate(name,password)) {
            map.put("name", name);
            map.put("password", password);
            return "welcome";
        }
        else{
            map.put("errorMessage", "Invalid Credentials");
            return "login";
        }
    }



}
